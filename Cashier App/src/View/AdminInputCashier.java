/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Data.UserData;
import Model.ProdukModel;
import Model.UserModel;
import java.util.ArrayList;
import java.util.List;
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
        String [] defaultTable = {"ID", "Jenis", "Produk","Nama", "Harga", "Stok"};
        model = new DefaultTableModel(defaultTable, 0);
        tableProduk.setModel(model);
        displayDataProduk();
    }
    
    private void displayDataProduk(){
        List<UserModel> ls = new ArrayList<UserModel>();
        ls = new UserData().getAll();
        String DataProduk[][] = new String[ls.size()][6];
        for( int i = 0; i < ls.size(); i++ ){
            DataProduk[i][0] = ls.get(i).getId();
            DataProduk[i][1] = ls.get(i).getJenis();
            DataProduk[i][2] = ls.get(i).getProduk();
            DataProduk[i][3] = ls.get(i).getNama();
            DataProduk[i][4] = ls.get(i).getHarga();
            DataProduk[i][5] = ls.get(i).getStok();
        }

        tableProduk.setModel(new DefaultTableModel(DataProduk, new String[]{"ID", "Jenis", "Produk","Nama", "Harga", "Stok"}));
    }

    private void reset(){
        idTextField.setText("ID");
        comboBoxJenis.setSelectedIndex(0);
        comboBoxProdukParent.setSelectedIndex(0);
        comboBoxProdukChild.setSelectedIndex(0);
        hargaTextField.setText("Harga");
        stokTextField.setText("Stok");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        idTextField = new javax.swing.JTextField();
        comboBoxJenis = new javax.swing.JComboBox();
        comboBoxProdukChild = new javax.swing.JComboBox();
        comboBoxProdukParent = new javax.swing.JComboBox();
        hargaTextField = new javax.swing.JTextField();
        stokTextField = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        tableProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Jenis", "Produk", "Nama", "Harga", "Stok"
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

        comboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Jenis", "Makanan", "Minuman", "Cemilan", "Permen" }));
        comboBoxJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxJenisActionPerformed(evt);
            }
        });

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

        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

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
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxProdukParent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxProdukChild, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(stokTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(comboBoxJenis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProdukParent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxProdukChild, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxJenisActionPerformed
        //Pilih Jenis, Makanan, Minuman, Cemilan, Permen
        switch(comboBoxJenis.getSelectedIndex()){
            case 0 :
                //tidak pilih
                comboBoxProdukParent.setModel(new DefaultComboBoxModel(produkModel.getDefaultIndex()));
                break;
            case 1 :
                //makanan
                comboBoxProdukParent.setModel(new DefaultComboBoxModel(produkModel.getMakanan()));                
                break;
            case 2 :
                //minuman
                break;
            case 3 :
                //cemilan
                break;
            case 4 :
                //permen
                break;
            default :
        }
        if(comboBoxJenis.getSelectedIndex() > 0){
            produkModel.setIdJenis(valueExtends(comboBoxJenis.getSelectedIndex()));
            idTextField.setText(produkModel.getIdJenis());
        }
    }//GEN-LAST:event_comboBoxJenisActionPerformed
    private String valueExtends(int value){
        String val;
        if(value >=10){
            val = "0"+value;
        }else{
            val = "00"+value;
        }
        return val;
    }
    private void comboBoxProdukParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdukParentActionPerformed
        switch(comboBoxProdukParent.getSelectedIndex()){
            case 0 :
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getDefaultIndex()));
                break;
            case 1 :
                comboBoxProdukChild.setModel(new DefaultComboBoxModel(produkModel.getIndomie()));
                
                break;
        }
        if(comboBoxProdukParent.getSelectedIndex() > 0){
            produkModel.setIdProduk(valueExtends(comboBoxProdukParent.getSelectedIndex()));
            idTextField.setText(produkModel.getIdJenis() + produkModel.getIdProduk());
        }
    }//GEN-LAST:event_comboBoxProdukParentActionPerformed

    private void comboBoxProdukChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProdukChildActionPerformed
        if(comboBoxProdukChild.getSelectedIndex() > 0){
            produkModel.setIdNama(valueExtends(comboBoxProdukChild.getSelectedIndex()));
            idTextField.setText(produkModel.getIdJenis()+produkModel.getIdProduk()+produkModel.getIdNama());
        }
    }//GEN-LAST:event_comboBoxProdukChildActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        UserModel insertCash = new UserModel();
        insertCash.setId(idTextField.getText());
        insertCash.setNama((String) comboBoxProdukChild.getSelectedItem());
        insertCash.setJenis((String) comboBoxJenis.getSelectedItem());
        insertCash.setProduk((String) comboBoxProdukParent.getSelectedItem());
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
       comboBoxJenis.setSelectedItem(tableProduk.getValueAt(baris, 1));
       comboBoxProdukParent.setSelectedItem(tableProduk.getValueAt(baris, 2));
       comboBoxProdukChild.setSelectedItem(tableProduk.getValueAt(baris, 3));
       hargaTextField.setText(tableProduk.getValueAt(baris, 4).toString());
       stokTextField.setText(tableProduk.getValueAt(baris, 5).toString());
       
    }//GEN-LAST:event_tableProdukMouseClicked

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
    private javax.swing.JComboBox comboBoxJenis;
    private javax.swing.JComboBox comboBoxProdukChild;
    private javax.swing.JComboBox comboBoxProdukParent;
    private javax.swing.JButton delete;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton insert;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stokTextField;
    private javax.swing.JTable tableProduk;
    // End of variables declaration//GEN-END:variables
}
