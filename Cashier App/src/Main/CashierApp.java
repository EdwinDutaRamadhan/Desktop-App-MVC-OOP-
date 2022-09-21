/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Connection.UserConnection;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class CashierApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserConnection koneksi = new UserConnection();
        koneksi.getConnection();
    }
    
}
