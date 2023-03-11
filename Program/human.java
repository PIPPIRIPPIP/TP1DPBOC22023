// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi TP 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.ArrayList;


/* Membuat kelas Human */
// kelas ini direpresentasikan untuk atribut NIK, Nama, dan Jenis Kelamin
class Human {
    // Private atribut
    private String NIK;
    private String nama;
    private String jenis_kelamin;

    // Konstruktor
    public Human(String NIK, String nama, String jenis_kelamin) {
        this.NIK = NIK;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
    }

    /* Getter and Setter*/
    // NIK
    public String getNIK() {
        return NIK;
    }
    public void setNIK(String nIK) {
        NIK = nIK;
    }
    // Nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    // Gender
    public String getJenisKelamin() {
        return jenis_kelamin;
    }
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    // Human activity
    public void sleep() {
        System.out.println(this.nama + " is sleeping.");
    }
    
    public void eat() {
        System.out.println(this.nama + " is eating.");
    }
    
    public void drink() {
        System.out.println(this.nama + " is drinking.");
    }
}

/*  Membuat Kelas Civitas Akademik */
// Kelas ini merepresentasikan asal_univ dan email_education
// Kelas ini merupakan anak dari kelas Human, alasannnya karena civitas akademik adalah
// komunitas yang aktif di bidang akademik, yang pasti merupakan seorang manusia
class SivitasAkademik extends Human {
    // Private atribut
    private String asal_universitas;
    private String email_edu;

    // Konstruktor
    public SivitasAkademik(String NIK, String nama, String jenis_kelamin, String asal_universitas, String email_edu) {
        super(NIK, nama, jenis_kelamin);
        this.asal_universitas = asal_universitas;
        this.email_edu = email_edu;
    }

    /* Getter and Setter */
    // AsalUniv
    public String getAsalUniversitas() {
        return asal_universitas;
    }
    public void setAsal_universitas(String asal_universitas) {
        this.asal_universitas = asal_universitas;
    }
    // Email
    public String getEmailEdu() {
        return email_edu;
    }
    public void setEmail_edu(String email_edu) {
        this.email_edu = email_edu;
    }
}

/* Membuat kelas Mahasiswa */
// Kelas ini merepresentasikan NIM, Fakultas, dan Prodi
// Alasan kelas ini menjadi anak dari civitas akademik adalah
// karena civitas akademik berisi mahasiswa dan dosen.
class Mahasiswa extends SivitasAkademik {
    // Private atribut
    private String NIM;
    private String fakultas;
    private String prodi;   
    private ArrayList<buku> listBuku = new ArrayList<>();
    private String laptop;
    
    // kosntruktor
    public Mahasiswa(String NIK, String nama, String jenis_kelamin, String asal_universitas, String email_edu,
                    String nIM, String fakultas, String prodi, String laptop) {
        super(NIK, nama, jenis_kelamin, asal_universitas, email_edu);
        this.NIM = nIM;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.laptop = laptop;
    }

    /* Getter and Setter */
    // NIM
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String nIM) {
        NIM = nIM;
    }
    // Fakultas
    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    // Prodi
    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    // Laptop
    public String getLaptop() {
        return laptop;
    }
    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    // Metode untuk menambahkan buku ke dalam daftar buku
    public void addBuku(buku data){
        listBuku.add(data);
    }

    // Metode untuk mencetak daftar buku yang dimiliki mahasiswa
    public void cetakBuku() {
        if(listBuku.size() == 0){
            // Jika lsit buku kosong
            System.out.println("  Belum ada data buku");
        }else{
            // jika list buku tidak kosong
            System.out.print("  Buku yang dimiliki : ");
            System.out.println("- " + listBuku.get(0).getJudulBuku());
            for(int i = 1; i < listBuku.size(); i++){
                System.out.println("\t\t       - " + listBuku.get(i).getJudulBuku());
            }
        }
    }
}

/* Membuat kelas Dosen */
// Kelas ini merepresentasikan NIP, Fakultas, dan Prodi
// Alasan kelas ini menjadi anak dari civitas akademik adalah
// karena civitas akademik berisi mahasiswa dan dosen.
class Dosen extends SivitasAkademik{
    // Private atribut
    private String NIP;
    private String fakultas;
    private String prodi;
    private ArrayList<spidol> listSpidol = new ArrayList<>();
    private String laptop;
    
    // Konstruktor
    public Dosen(String NIK, String nama, String jenis_kelamin, String asal_universitas, String email_edu, String nIP,
            String fakultas, String prodi, String laptop) {
        super(NIK, nama, jenis_kelamin, asal_universitas, email_edu);
        this.NIP = nIP;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.laptop = laptop;
    }
    /* Getter and Setter*/
    // NIP
    public String getNIP() {
        return NIP;
    }
    public void setNIP(String nIP) {
        NIP = nIP;
    }
    // Fakultas
    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    // Prodi
    public String getProdi() {
        return prodi;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    // Laptop
    public String getLaptop() {
        return laptop;
    }
    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    // Metode untuk menambahkan spidol ke daftar spidol dosen
    public void addSpidol(spidol data){
        listSpidol.add(data);
    }
    
    // Metode untuk mencetak daftar spidol yang dimiliki dosen
    public void cetakSpidol() {
        if(listSpidol.size() == 0){
            // jika list spidol kosong
            System.out.println("  Belum ada data buku");
        }else{
            // jika list spidol tidak kosong
            System.out.print("  Spidol yang dimiliki : ");
            System.out.println("- " + listSpidol.get(0).getSpidol());
            for(int i = 1; i < listSpidol.size(); i++){
                System.out.println("\t\t\t - " + listSpidol.get(i).getSpidol());
            }
        }
    }
}