/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ProdukModel;
import Model.UserModel;
import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface Interface {
    public List<UserModel> getAll();
    public List<ProdukModel> getMakanan();
    public boolean insertData(UserModel cashier);
    public boolean deleteData(UserModel cashier);
    public boolean tambahData(UserModel cashier);
}
