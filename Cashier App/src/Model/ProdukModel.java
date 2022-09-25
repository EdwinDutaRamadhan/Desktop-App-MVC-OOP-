package Model;

public class ProdukModel {
    //{"Pilih Produk", "Indomie", "Sarimi", "Sedap"};
    private String[] jenis;
    private String[] makanan, minuman, cemilan, permen;
    private String[] indomie;
    private String defaultIndex[] = {"Pilih Produk"};
    private String defaultJenis[] = {"Pilih Jenis"};
    private String idJenis, idProduk,idNama;
    
    public String[] indomieGoreng = {
            "Pilih Varian",
            "Original" ,
            "Rasa Rendang" ,
            "Rasa Sate" ,
            "Rasa Sambal Matah" ,
            "Rasa Pedas" ,
            "Rasa Iga Penyet" ,
            "Rasa Cabe Ijo" ,
            "Rasa Soto" ,
            "Rasa Ayam Bawang" ,
            "Kriuuk..8x Pedas" ,
            "Kriuuk..8x Ayam" ,
            "Jumbo" ,
            "Rasa Sambal Rica-rica"
    };
    
    public String[] indomieKuah = {
            "Pilih Varian",
            "Ayam Spesial" ,
            "Soto Mie" ,
            "Baso Sapi" ,
            "Kaldu Udang" ,
            "Soto Spesial" ,
            "Kari Ayam ekstra bawang goreng" ,
            "Kari Ayam" ,
            "Kaldu Ayam" ,
            "Ayam Bawang"
    };
    
    public String[] indomieKulinerIndonesia = {
            "Pilih Varian",
            "Mi Goreng Aceh",
            "Rasa Tengkleng",
            "Rasa Soto Padang",
            "Mi Goreng Rasa Cakalang",
            "Mi Rasa Cakalang",
            "Mi Goreng Masak Habang",
            "Rasa Mi Kocok Bandung",
            "Rasa Soto Makassar",
            "Rasa Soto Banjar",
            "Rasa Soto padang",
            "Rasa Mi Celor",
            "Rasa Empal Gentong",
            "Rasa Soto Lamongan",
            "Rasa Soto Medan",
            "Rasa Soto Banjar Limau Kuit",
            "Mi Goreng Rasa Tahu tek",
            "Rasa Soto Betawi",
            "Rasa Kari Ayam Medan",
            "Rasa Sop Buntut"
    };    
    
    public String[] indomieRealMeat = {
            "Pilih Varian",
            "Pepper Chicken",
            "Mushroom",
            "Rendang"
    };
    
    public String[] indomiePremiumCollection = {
            "Pilih Varian",
            "Mi Keriting Goreng Spesial",
            "Mi Keriting Rasa Ayam Panggang",
            "Mi Keriting Salted Egg",
            "Mi Keriting Goreng Rasa Ayam Cabe Rawit",
            "Mi Keriting Goreng Rasa Kornet",
            "Mi Keriting Rasa Laksa Spesial"
    };
    
    public String[] indomieHypeAbis = {
            "Pilih Varian",
            "Mi Goreng Rasa Ayam Geprek",
            "Mi Goreng Rasa Chitato",
            "Rasa Seblak Hot Jeletot"
    };
    
    public String[] indomieTasteofAsia = {
            "Pilih Varian",
            "Mi Goreng Rasa Bulgogi ala Korea",
            "Mi Kuah Rasa Tom Yum ala Thailand",
            "Mi Kuah Rasa Laksa ala Singapura"
    };
    
    public String[] indomieMyNoodlez = {
            "Pilih Varian",
            "Rasa Rumput Laut",
            "Rasa Salmon Teriyaki",
            "Rasa Pizza Cheese"
    };
    
    public String[] indomieChatzMie = {
            "Pilih Varian",
            "Chicken Lemon",
            "BBQ Sausage",
            "Pizza Favorite"
    };
    
    public String[] getMinuman() {
        return minuman;
    }

    public void setMinuman(String[] minuman) {
        this.minuman = minuman;
    }

    public String[] getCemilan() {
        return cemilan;
    }

    public void setCemilan(String[] cemilan) {
        this.cemilan = cemilan;
    }

    public String[] getPermen() {
        return permen;
    }

    public void setPermen(String[] permen) {
        this.permen = permen;
    }
        
    public void setIndomie(String[] indomie) {
        this.indomie = indomie;
    }
    
    public void setJenis(String[] jenis) {
        this.jenis = jenis;
    }
    
    
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

    
    
    
    
    
}
