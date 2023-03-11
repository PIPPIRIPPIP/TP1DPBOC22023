## Janji

Saya Ayesha Ali Firdaus (NIM 2101990) mengerjakan evaluasi TP 1 dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

## Desain Program

![desain](/Screenshot/TP.png)

Terdapat 8 kelas dalam progra yang dibuat:

1. Kelas Human, kelas ini digunakan untuk mempresentasikan objek sebagai manusia, dimana terdapat atribut berupa NIK, Nama, dan Jenis Kelamin. Kelas ini menjadi kelas utama dari kelas lainnya yang memiliki objek sama yaitu manusia.

2. Kelas Sivitas Akademik, kelas ini digunakan untuk mempresentasikan objek sebagai sekelompok orang yang aktif di lingkup akademi, dimana ada dua atribut yaitu asal universitas dan email universitas. Kelas ini merupakan anak dari kelas Human.

3. Kelas Mahasiswa, kelas ini digunakan untuk mempresentasikan objek sebagai mahasiswa, dimana ada beberapa atribut yang yang mencirikan sebagai mahasiswa yaitu NIM, Program Studi, Fakultas, daftar buku, dan laptop. Kelas ini merupakan anak dari kelas sivitas akademik, karena mahasiswa merupakan bagian dari kelompok sivitas akademik.

4. Kelas Dosen, Kelas ini mempresentasikan objek sebagai dosen, dimana terdapat beberapa atribut yaitu NIP, Fakultas, Program Studi, daftar spidol dan laptop. Kelas ini merupakan anak dari kelas Sivitas akademik karena sivitas akademik terdiri dari mahasiswa dan dosen.

5. Kelas Buku, kelas ini mempresentasikan objek sebagai buku, dimana terdapat 2 atribut yaitu kode buku dan judul buku. Kelas ini melakukan composite dengan Mahasiswa untuk mengisi atribut daftar mahasiswa.

6. Kelas Spidol, kelas ini mempresentasikan objek sebagai spidol, dimana terdapat 2 atribut yaitu kode spidol dan merk spidol. Kelas ini melakukan composite dengan Dosen untuk mengisi atribut daftar spidol.

7. Kelas Organization, kelas ini mempresentasikan suatu organisasi, dimana terdapat 2 atribut yang mencirikan sebagai oraganisasi yaitu nama oraganisasi dan mahasiswa anggota organisasi. Kelas ini melakukan composite dengan Mahasiswa karena kelas ini membutuhkan data mahasiswa dari kelas Mahasiswa.

8. Kelas Asdod, kelas ini mempresentasikan objek sebagai asisten dosen, dimana terdapat 2 atribut yang mencirikan sebagai assiten dosen yaitu dosen dan mahasiswa yang menjadi asdos. Kelas ini melakukan composite dengan 2 kelas yaitu Dosen dan Mahasiswa.

## Alur Program

Pada program ini inputan dilakukan secara manual dan output yang ditampilkan berupa list daftar mahasiswa (data diri, daftar buku, dan merk laptop), list daftar dosen (data diri, daftar spidol, dan merk laptop), daftar organisasi beserta anggotanya, dan dosen yang memiliki asisten beserta mahasiswanya.

## Dokumentasi

- List Daftar Dosen

![daftar dosen](/Screenshot/Dosen.png)

- List Daftar Mahasiswa

![daftar mahasiswa](/Screenshot/Mahasiswa.png)

- List Organisasi dan Asdos

![desain](/Screenshot/Org_Asdos.png)
