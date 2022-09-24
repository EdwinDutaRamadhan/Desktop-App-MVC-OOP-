package Model;

public class ProdukModel {
    //{"Pilih Produk", "Indomie", "Sarimi", "Sedap"};
    private String makanan[];
    private String makananTemp;
    private String jenis[] = {"Pilih Jenis", "Makanan", "Minuman", "Cemilan", "Permen"};
    private String indomie[] = {"Pilih Produk", "Indomie Goreng", "Indomie Rebus", "Indomie Kuliner Indonesia", "Indomie Real Meat", "Indomie Premium Collection", "Indomie Hype Abis", "Indomie Taste of Asia", "Indomie My Noodlez", "Indomie Chatz Mie"};
    private String defaultIndex[] = {"Pilih Produk"};
    private String defaultJenis[] = {"Pilih Jenis"};
    private String idJenis, idProduk,idNama;
    public String[] getMakanan() {
        return makanan;
    }

    public String[] getIndomie() {
        return indomie;
    }

    public String[] getDefaultIndex() {
        return defaultIndex;
    }

    public String getIdJenis() {
        return idJenis;
    }

    public void setIdJenis(String idJenis) {
        this.idJenis = idJenis;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getIdNama() {
        return idNama;
    }

    public void setIdNama(String idNama) {
        this.idNama = idNama;
    }

    public String[] getDefaultJenis() {
        return defaultJenis;
    }

    public String[] getJenis() {
        return jenis;
    }

    public void setMakanan(String[] makanan) {
        this.makanan = makanan;
    }

    public String getMakananTemp() {
        return makananTemp;
    }

    public void setMakananTemp(String makananTemp) {
        this.makananTemp = makananTemp;
    }
    
    
    
    
}
