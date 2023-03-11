// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi TP 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.ArrayList;

// Membuat kelas organisasi
class oraganization{
    // Private
    private String nama;
    private ArrayList<Mahasiswa> listMhs = new ArrayList<>();

    // Konstruktor
    public oraganization(String nama) {
        this.nama = nama;
    }

    // Getter and Setter
    // Nama Org
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Metode untuk manambahkan mahasiswa ke list mahasiswa (anggota org)
    public void addMahasiswa(Mahasiswa mahasiswa) {
        listMhs.add(mahasiswa);
    }

    // Cetak Mahasiswa
    public void cetakMahasiswa() {
        if(listMhs.size() == 0){
            // jika list kosong
            System.out.println("  Data Mahasiswa kosong");
        }else{
            // jika list tidak kosong
            System.out.print("  Daftar Anggota   : ");
            System.out.println("- " + listMhs.get(0).getNama());
            for(int i = 1; i < listMhs.size(); i++){
                System.out.println("\t\t     - " + listMhs.get(i).getNama());
            }
        }
    }
}

// Membuat kelas asisten dosen
class asdos{
    // Pritvate
    private Dosen dosen;
    private ArrayList<Mahasiswa> listMhs = new ArrayList<>();
    
    // Konstruktor
    public asdos(Dosen nama) {
        dosen = nama;
    }

    // Getter and Setter
    // Nama dosen
    public String getNama() {
        return dosen.getNama();
    }
    public void setNama(Dosen nama) {
        dosen = nama;
    }

    // Metode untuk manambahkan mahasiswa ke list mahasiswa (asdos)
    public void addMahasiswa(Mahasiswa mahasiswa) {
        listMhs.add(mahasiswa);
    }

    // Mencetak daftar mahasiswa yang menjadi asdos
    public void cetakMahasiswa() {
        if(listMhs.size() == 0){
            // jika list mahasiswa kosong
            System.out.println("  Data Mahasiswa kosong");
        }else{
            // jika list mahasiswa kosong
            System.out.print("  Daftar Asisten   : ");
            System.out.println("- " + listMhs.get(0).getNama());
            for(int i = 1; i < listMhs.size(); i++){
                System.out.println("\t\t     - " + listMhs.get(i).getNama());
            }
        }
    }
}