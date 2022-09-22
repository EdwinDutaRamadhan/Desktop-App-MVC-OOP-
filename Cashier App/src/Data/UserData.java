/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import Connection.UserConnection;
import Controller.Interface;
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
                cashier.setNama(rs.getString(2));
                cashier.setJenis(rs.getString(3));
                cashier.setHarga(rs.getString(4));
                cashier.setStok(rs.getString(5));
                ls.add(cashier);
                System.out.println(cashier);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("get all failed");
        }
        return ls;
        
    }

}
