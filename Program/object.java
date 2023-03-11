// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi TP 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Membuat Kelas Buku
class buku{
    // Private atribute
    private String kode;
    private String judulBuku;

    // Konstruktor
    public buku(String kode, String judul){
        this.kode = kode;
        judulBuku = judul;
    }

    // Getter and Setter
    // Kode
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }

    // Judul Buku
    public String getJudulBuku() {
        return judulBuku;
    }
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
}

// Membuat Kelas Spidol
class spidol{
    private String kode;
    private String spidol;

    // Kosntruktor
    public spidol(String kode, String spidol) {
        this.kode = kode;
        this.spidol = spidol;
    }

    // Getter and Setter
    // Kode
    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }

    // spidol
    public String getSpidol() {
        return spidol;
    }
    public void setSpidol(String spidol) {
        this.spidol = spidol;
    }
}
