// Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi TP 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek
// untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

// Import Library
import java.util.ArrayList;

public class main {
        public static void main(String[] args) {
                // Membuat list
                ArrayList<Mahasiswa> dataMhs = new ArrayList<>(); //---- list untuk menampung data mahasiswa
                ArrayList<Dosen> dataDosen = new ArrayList<>(); //------ list untuk menampung data dosen
                ArrayList<oraganization> dataOrg = new ArrayList<>(); // list untuk menampung data organisasi
                ArrayList<asdos> dataAsdos = new ArrayList<>(); //------ list untuk menampung data asisten dosene
                
                // Membuat objek buku
                buku buku1 = new buku("B01", "Buku Catatan");
                buku buku2 = new buku("B02", "Buku Modul");
                buku buku3 = new buku("B03", "Buku Novel");

                // Membuat objek spidol
                spidol spidol1 = new spidol("S01", "Snowman");
                spidol spidol2 = new spidol("S02", "Kenko");
                spidol spidol3 = new spidol("S03", "Joyko");
                
                // Menambahkan data mahasiswa
                // Mahasiswa 1
                Mahasiswa mhs1 = new Mahasiswa("12345", "Resyad", "Laki-laki", "UPI", "Resyad@upi.edu", "2101", "FPMIPA", "Ilmu Komputer", "Asus");
                dataMhs.add(mhs1);
                /* Mahasiswa 2 */
                Mahasiswa mhs2 = new Mahasiswa("12346", "Pahri", "Laki-laki", "UPI", "Pahri@upi.edu", "2102", "FPMIPA", "Ilmu Komputer", "Lenovo");
                dataMhs.add(mhs2);
                /* Mahasiswa 3 */ 
                Mahasiswa mhs3 = new Mahasiswa("12347", "Angga", "Laki-laki", "UPI", "Angga@upi.edu", "2103", "FPMIPA", "Ilmu Komputer", "Apple");
                dataMhs.add(mhs3);
                // Mahasiswa 4
                Mahasiswa mhs4 = new Mahasiswa("12348", "Getsbi", "Laki-laki", "UPI", "Getsbi@upi.edu", "2104", "FPMIPA", "Ilmu Komputer", "Acer");
                dataMhs.add(mhs4);
                // Mahasiwa 5
                Mahasiswa mhs5 = new Mahasiswa("12349", "Mila", "Perempuan", "UPI", "Mila@upi.edu", "2105", "FPMIPA", "Ilmu Komputer", "Hp");
                dataMhs.add(mhs5);


                // Menambahkan data buku ke mahasiswa
                mhs1.addBuku(buku1);
                mhs1.addBuku(buku2);
                mhs2.addBuku(buku2);
                mhs2.addBuku(buku3);
                mhs3.addBuku(buku3);
                mhs3.addBuku(buku1);
                mhs4.addBuku(buku2);
                mhs5.addBuku(buku3);

                // Menambahkan data dosen
                // Dosen 1
                Dosen dosen1 = new Dosen("12355", "Rose", "Perempuan", "UPI", "rose@upi.edu", "54321", "FPMIPA", "Ilmu Komputer", "Asus");
                dataDosen.add(dosen1);
                // Dosen 2
                Dosen dosen2 = new Dosen("12356", "Lala", "Laki-laki", "UPI", "lala@upi.edu", "54322", "FPMIPA", "Ilmu Komputer", "Acer");
                dataDosen.add(dosen2);

                // Menambahkan data spidol ke dosen
                dosen1.addSpidol(spidol1);
                dosen1.addSpidol(spidol2);
                dosen2.addSpidol(spidol2);
                dosen2.addSpidol(spidol3);

                // Menambahkan data oraganisasi
                oraganization org1 = new oraganization("BEM KEMAKOM");
                dataOrg.add(org1);
                oraganization org2 = new oraganization("EC KEMAKOM");
                dataOrg.add(org2);
                // Manambahkan mahasiswa ke dalam organisasi
                org1.addMahasiswa(mhs2);
                org2.addMahasiswa(mhs3);
                org2.addMahasiswa(mhs4);

                // Menambahkan data asdos
                // Dosen 1
                asdos asdos1 = new asdos(dosen1);
                dataAsdos.add(asdos1);
                asdos1.addMahasiswa(mhs5); // menambahkan data mahasiswa yang menjadi asisten dosen1
                // Dosen 2
                asdos asdos2 = new asdos(dosen2);
                dataAsdos.add(asdos2);
                asdos2.addMahasiswa(mhs1); // menambahkan data mahasiswa yang menjadi asisten dosen2
                asdos2.addMahasiswa(mhs2);
                asdos2.addMahasiswa(mhs3);

                // Mencetak daftar semua mahasiswa yang berada di list mahasiswa (dataMhs)
                System.out.println("======================================");
                System.out.println("           Daftar Mahasiswa           ");
                System.out.println("======================================");
                for (int i = 0; i < dataMhs.size(); i++) {
                        System.out.println((i+1) + ".NIK              : " + dataMhs.get(i).getNIK());
                        System.out.println(       "  Nama             : " + dataMhs.get(i).getNama());
                        System.out.println(       "  Jenis Kelamin    : " + dataMhs.get(i).getJenisKelamin());
                        System.out.println(       "  Asal Universitas : " + dataMhs.get(i).getAsalUniversitas());
                        System.out.println(       "  Email Education  : " + dataMhs.get(i).getEmailEdu());
                        System.out.println(       "  NIM              : " + dataMhs.get(i).getNIM());
                        System.out.println(       "  Fakultas         : " + dataMhs.get(i).getFakultas());
                        System.out.println(       "  Program Studi    : " + dataMhs.get(i).getProdi());
                        System.out.println(       "  Laptop           : " + dataMhs.get(i).getLaptop());
                        dataMhs.get(i).cetakBuku();
                        System.out.println("--------------------------------------");
                }

                // Mencetak daftar semua dosen yang berada di list dosen (dataDosen)
                System.out.println("\n======================================");
                System.out.println("             Daftar Dosen             ");
                System.out.println("======================================");
                for (int i = 0; i < dataDosen.size(); i++) {
                        System.out.println((i+1) + ".NIK              : " + dataDosen.get(i).getNIK());
                        System.out.println(       "  Nama             : " + dataDosen.get(i).getNama());
                        System.out.println(       "  Jenis Kelamin    : " + dataDosen.get(i).getJenisKelamin());
                        System.out.println(       "  Asal Universitas : " + dataDosen.get(i).getAsalUniversitas());
                        System.out.println(       "  Email Education  : " + dataDosen.get(i).getEmailEdu());
                        System.out.println(       "  NIP              : " + dataDosen.get(i).getNIP());
                        System.out.println(       "  Fakultas         : " + dataDosen.get(i).getFakultas());
                        System.out.println(       "  Program Studi    : " + dataDosen.get(i).getProdi());
                        System.out.println(       "  Laptop           : " + dataDosen.get(i).getLaptop());
                        dataDosen.get(i).cetakSpidol();
                        System.out.println("--------------------------------------");
                }

                // Mencetak daftar semua organisasi beserta anggotanya yang berada di list organisasi (dataOrg)
                System.out.println("\n======================================");
                System.out.println("          Daftar Organisasi           ");
                System.out.println("======================================");
                for (int i = 0; i < dataOrg.size(); i++) {
                        System.out.println((i+1) + ".Nama Organisasi  : " + dataOrg.get(i).getNama());
                        dataOrg.get(i).cetakMahasiswa();
                        System.out.println("--------------------------------------");
                }

                // Mencetak daftar dosen yang memiliki asisten beserta mahasiswanya (dataAsdos)
                System.out.println("\n======================================");
                System.out.println("          Data Asisten Dosen          ");
                System.out.println("======================================");
                for (int i = 0; i < dataAsdos.size(); i++) {
                        System.out.println((i+1) + ".Nama Dosen : " + dataAsdos.get(i).getNama());
                        dataAsdos.get(i).cetakMahasiswa();
                        System.out.println("--------------------------------------");
                }
        }
}