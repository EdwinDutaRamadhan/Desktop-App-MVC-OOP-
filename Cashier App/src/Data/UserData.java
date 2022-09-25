/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import Connection.UserConnection;
import Controller.Interface;
import Model.ProdukModel;
import Model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UserData implements Interface{
    UserModel cashier;
    ProdukModel product;
    private Connection koneksi = null;
    
    public UserData(){
        this.koneksi = new UserConnection().getConnection();
    }
    
    @Override
    public List<UserModel> getAll() {
        List<UserModel> ls = new ArrayList<>();
        
        try {         
            PreparedStatement ps = koneksi.prepareStatement("SELECT * FROM tbl_produk");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                cashier = new UserModel();
                cashier.setId(rs.getString(1));
                cashier.setJenis(rs.getString(2));
                cashier.setVarian(rs.getString(3));
                cashier.setHarga(rs.getString(4));
                cashier.setStok(rs.getString(5));
                ls.add(cashier);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("get all failed");
        }
        return ls;
        
    }

    @Override
    public boolean insertData(UserModel cashier) {
        boolean result = false;
        
        try {
            PreparedStatement ps = koneksi.prepareStatement("INSERT INTO tbl_produk" + " VALUES (?,?,?,?,?)");
            
            ps.setString(1, cashier.getId());
            ps.setString(2, cashier.getJenis());
            ps.setString(3, cashier.getVarian());
            ps.setString(4, cashier.getHarga());
            ps.setString(5, cashier.getStok());
            ps.executeUpdate();
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        return result;
    }

    @Override
    public boolean deleteData(UserModel cashier) {
        boolean result = false;
        try {
            PreparedStatement ps = koneksi.prepareStatement("DELETE FROM tbl_produk WHERE id=?");
            ps.setString(1, cashier.getId());
            ps.executeUpdate();
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public boolean tambahData(UserModel cashier) {
        boolean result = false;
        String query = "UPDATE tbl_produk SET jenis=?, varian=?, harga=?, stok=? WHERE id=?";
        try {
            PreparedStatement ps = koneksi.prepareStatement(query);
            ps.setString(5, cashier.getId());
            ps.setString(1, cashier.getJenis());
            ps.setString(2, cashier.getVarian());
            ps.setString(3, cashier.getHarga());
            ps.setString(4, cashier.getStok());
            ps.executeUpdate();
            result = true;
        } catch (SQLException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }


  


   

    

}
