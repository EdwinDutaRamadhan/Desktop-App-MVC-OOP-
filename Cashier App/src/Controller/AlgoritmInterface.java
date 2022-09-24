/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ProdukModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface AlgoritmInterface {
    public String jenisIdGenerate(int idJenis);
    public String parentIdGenerate(int idProduk);
    public String childIdGenerate(int idNama);
}
