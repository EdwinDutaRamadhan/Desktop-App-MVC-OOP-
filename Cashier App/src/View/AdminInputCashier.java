/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Algoritm.Algoritm;
import Data.UserData;
import Model.ProdukModel;
import Model.UserModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class AdminInputCashier extends javax.swing.JFrame {
    
    DefaultTableModel model;
    UserModel cashier = new UserModel();
    UserData data = new UserData();
    ProdukModel produkModel = new ProdukModel();
    public AdminInputCashier() {
        initComponents();
        startUpProgram();
        
    }
    
    
    private void startUpProgram(){
        String[] jenisProduk = {"Pilih Produk", "Indomie Goreng", "Indomie Kuah", "Indomie Kuliner Indonesia", "Indomie Rreal Meat","Indomie Premium Collection","Indomie Hype Abis","Indomie Taste of Asia","Indomie My Noodlez","Indomie Chatz Mie"};
        produkModel.setJenis(jenisProduk);
        comboBoxProdukParent.setModel(new DefaultComboBoxModel(produkModel.getJenis()));
        String [] defaultTable = {"ID", "Jenis", "Varian","Harga", "Stok"};
        model = new DefaultTableModel(defaultTable, 0);
        tableProduk.setModel(model);
        displayDataProduk();
        tambahan.setVisible(false);
        tambahanStok.setVisible(false);
    }
    
    private void displayDataProduk(){
        List<UserModel> ls = new ArrayList<UserModel>();
        ls = new UserData().getAll();
        String DataProduk[][] = new String[ls.size()][5];
        for( int i = 0; i < ls.size(); i++ ){
            DataProduk[i][0] = ls.get(i).getId();
            DataProduk[i][1] = ls.get(i).getJenis();
            DataProduk[i][2] = ls.get(i).getVarian();
            DataProduk[i][3] = ls.get(i).getHarga();
            DataProduk[i][4] = ls.get(i).getStok();
        }

        tableProduk.setModel(new DefaultTableModel(DataProduk, new String[]{"ID", "Jenis", "Varian","Harga", "Stok"}));
    }

    private void reset(){
        idTextField.setText("ID");
        comboBoxProdukParent.setSelectedIndex(0);
        comboBoxProdukChild.setSelectedIndex(0);
        hargaTextField.setText("Harga");
        stokTextField.setText("Stok");
        tambahan.setVisible(false);
        tambahanStok.setVisible(false);
        tambahanStok.setText("0");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        idTextField = new javax.swing.JTextField();
        comboBoxProdukChild = new javax.swing.JComboBox();
        comboBoxProdukParent = new javax.swing.JComboBox();
        hargaTextField = new javax.swing.JTextField();
        stokTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        tambahanStok = new javax.swing.JTextField();
        tambahan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tableProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Jenis", "Varian", "Harga", "Stok"
            }
        ));
        tableProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduk);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        idTextField.setEditable(false);
        idTextField.setText("ID");

        comboBoxProdukChild.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Produk" }));
        comboBoxProdukChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdukChildActionPerformed(evt);
            }
        });

        comboBoxProdukParent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Produk" }));
        comboBoxProdukParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProdukParentActionPerformed(evt);
            }
        });

        hargaTextField.setText("Harga");

        stokTextField.setText("Stok");

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tambahanStok.setText("0");
        tambahanStok.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tambahan.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tambahan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambahan.setText("+");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxProdukParent, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxProdukChild, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tambahanStok, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(stokTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(tambahan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stokTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProdukParent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProdukChild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tambahan, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tambahanStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxProdukParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdukParentActionPerformed
        
        switch(comboBoxProdukParent.getSelectedIndex()){
            case 0 :
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getDefaultIndex()));
                break;
            case 1 :
                //indomie goreng
                produkModel.setIndomie(produkModel.indomieGoreng);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 2 :
                //Indomie Kua
                produkModel.setIndomie(produkModel.indomieKuah);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 3 :
                //Indomie Kuliner 
                produkModel.setIndomie(produkModel.indomieKulinerIndonesia);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 4 :
                //Indomie Real Meat
                produkModel.setIndomie(produkModel.indomieRealMeat);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 5 :
                //Indomie Premium Collection
                produkModel.setIndomie(produkModel.indomiePremiumCollection);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 6 :
                //Indomie Hype Abis
                produkModel.setIndomie(produkModel.indomieHypeAbis);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 7 :
                //Indomie Taste of Asia
                produkModel.setIndomie(produkModel.indomieTasteofAsia);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 8 :
                //Indomie My Noodlez
                produkModel.setIndomie(produkModel.indomieMyNoodlez);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
            case 9 :
                //Indomie Chatz Mie
                produkModel.setIndomie(produkModel.indomieChatzMie);
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                break;
        }
        if(comboBoxProdukParent.getSelectedIndex() > 0){
            produkModel.setIdProduk(new Algoritm().parentIdGenerate(comboBoxProdukParent.getSelectedIndex()));
            idTextField.setText(produkModel.getIdProduk());
        }
    }//GEN-LAST:event_comboBoxProdukParentActionPerformed

    private void comboBoxProdukChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdukChildActionPerformed
        if(comboBoxProdukChild.getSelectedIndex() > 0){
            produkModel.setIdNama(new Algoritm().childIdGenerate(comboBoxProdukChild.getSelectedIndex()));
            idTextField.setText(produkModel.getIdProduk()+produkModel.getIdNama());
        }
    }//GEN-LAST:event_comboBoxProdukChildActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        UserModel insertCash = new UserModel();
        insertCash.setId(idTextField.getText());
        insertCash.setJenis((String) comboBoxProdukParent.getSelectedItem());
        insertCash.setVarian((String) comboBoxProdukChild.getSelectedItem());
        insertCash.setHarga(hargaTextField.getText());
        insertCash.setStok(stokTextField.getText());
        if(data.insertData(insertCash)){
            JOptionPane.showMessageDialog(this, "berhasil input");
            displayDataProduk();
            reset();
        }else{
            JOptionPane.showMessageDialog(this, "gagal input");
        }
    }//GEN-LAST:event_insertActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        UserModel deleteCash = new UserModel();
        deleteCash.setId(idTextField.getText());
        if(data.deleteData(deleteCash)){
            JOptionPane.showMessageDialog(this, "berhasil menghapus data");
            displayDataProduk();
            reset();
        }else{
            JOptionPane.showMessageDialog(this, "gagal menghapus data");
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void tableProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdukMouseClicked
       int baris = tableProduk.getSelectedRow();
       idTextField.setText(tableProduk.getValueAt(baris, 0).toString());
       comboBoxProdukParent.setSelectedItem(tableProduk.getValueAt(baris, 1));
       comboBoxProdukChild.setSelectedItem(tableProduk.getValueAt(baris, 2));
       hargaTextField.setText(tableProduk.getValueAt(baris, 3).toString());
       stokTextField.setText(tableProduk.getValueAt(baris, 4).toString());
       tambahan.setVisible(true);
       tambahanStok.setVisible(true);
    }//GEN-LAST:event_tableProdukMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        UserModel updateCash = new UserModel();
        String updateStok;
        int baris = tableProduk.getSelectedRow();
        int stokTemp = Integer.parseInt(stokTextField.getText());
        int stokTambahan = Integer.parseInt(tambahanStok.getText());
        int stok = stokTemp + stokTambahan;
        updateCash.setId(tableProduk.getValueAt(baris, 0).toString());
        updateCash.setJenis(tableProduk.getValueAt(baris, 1).toString());
        updateCash.setVarian(tableProduk.getValueAt(baris, 2).toString());
        updateCash.setHarga(hargaTextField.getText());
        String stokString = "" + stok;
        updateCash.setStok(stokString);
        if(data.tambahData(updateCash)){
            JOptionPane.showMessageDialog(this, "berhasil update data!");
            displayDataProduk();
            reset();
        }else{
            JOptionPane.showMessageDialog(this, "gagal update data!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        reset();
    }//GEN-LAST:event_tambahActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminInputCashier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminInputCashier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboBoxProdukChild;
    private javax.swing.JComboBox comboBoxProdukParent;
    private javax.swing.JButton delete;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton insert;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stokTextField;
    private javax.swing.JTable tableProduk;
    private javax.swing.JButton tambah;
    private javax.swing.JLabel tambahan;
    private javax.swing.JTextField tambahanStok;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
