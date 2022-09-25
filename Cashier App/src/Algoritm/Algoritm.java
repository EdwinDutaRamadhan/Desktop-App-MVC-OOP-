package Algoritm;

import Controller.AlgoritmInterface;
import Model.ProdukModel;

public class Algoritm implements AlgoritmInterface {
    @Override
    public String jenisIdGenerate(int idJenis) {
        String value;
        if(idJenis >= 10){
            value = "" + idJenis;
        }else{
            value = "0" + idJenis;
        }
        return value;
    }

    @Override
    public String parentIdGenerate(int idProduk) {
        String value = null;
        if(idProduk > 0 && idProduk < 10){
            value = "0" + idProduk;
        }else if(idProduk >= 10 && idProduk < 100){
            value = "" + idProduk;
        }
        return value;
    }

    @Override
    public String childIdGenerate(int idNama) {
        String value = null;
        if(idNama >= 10){
            value = "00"+ idNama;
        }else if(idNama > 100 && idNama < 1000){
            value = "0" + idNama;
        }else if(idNama <10){
            value = "000" + idNama;
        }
        return value;
    }
    
}
