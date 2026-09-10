## Nama : Elena Dementieva
## Kelas : Sistem Informasi A'25
## Pemrograman Berorientasi Objek

# Minpro-1-PBO-Sistem-Manajemen-CV-Mandiri-Prima-Kreatif

## Deskripsi Singkat Program

Sistem Manajemen CV Mandiri Prima Kreatif merupakan program berbasis Java yang dibuat untuk membantu mengelola data pada CV Mandiri Prima Kreatif yang bergerak di bidang elektronik dan pengadaan barang.

Program ini digunakan untuk mengelola tiga jenis data, yaitu data barang, data pemasok, dan data pengadaan. Pengelolaan data dilakukan dengan menerapkan konsep CRUD (Create, Read, Update, Delete), sehingga user dapat menambahkan, menampilkan, memperbarui, dan menghapus data.

Program dibuat dengan menerapkan konsep Pemrograman Berorientasi Objek (PBO), seperti class, object, constructor, access modifier, encapsulation, ArrayList, percabangan, input, perulangan, dan validasi input.

Program terdiri dari satu class entry point yaitu `SistemmanajemenCVMPK` serta empat class pendukung yaitu `Service`, `Barang`, `Pemasok`, dan `Pengadaan`.

---

## Tujuan Program

Program ini dibuat untuk menerapkan konsep dasar Pemrograman Berorientasi Objek melalui sebuah sistem pengelolaan data sederhana.

Tujuan dari program ini yaitu:

1. Membuat program CRUD menggunakan bahasa pemrograman Java.
2. Menerapkan penggunaan class dan object.
3. Menerapkan constructor pada class entitas.
4. Menerapkan `ArrayList` untuk menyimpan data.
5. Menerapkan percabangan untuk memilih menu.
6. Menerapkan input dari user dalam pemilihan menu.
7. Menerapkan perulangan agar program tetap berjalan sampai user memilih menu keluar.
8. Menerapkan perulangan untuk menampilkan data.
9. Menerapkan access modifier.
10. Menerapkan encapsulation menggunakan getter dan setter.
11. Menerapkan validasi input pada data tertentu.

---
# Class yang Digunakan

## 1. SistemmanajemenCVMPK

`SistemmanajemenCVMPK` merupakan class entry point yang digunakan untuk menjalankan program.

Class ini memiliki method `main()` yang menjadi titik awal ketika program dijalankan. Pada class ini terdapat `Scanner` yang digunakan untuk menerima input dari user dan object `Service` yang digunakan untuk menjalankan menu pengelolaan data.

Menu utama pada program terdiri dari:
1. Kelola Data Barang
2. Kelola Data Pemasok
3. Kelola Data Pengadaan
4. Keluar

Pemilihan menu dilakukan dengan memasukkan angka melalui keyboard.

Class ini juga menggunakan perulangan `while` agar menu utama terus ditampilkan selama user belum memilih menu Keluar.
## 2. Service

Class `Service` digunakan untuk menangani proses pengelolaan data pada program.

Class ini menjadi tempat untuk menjalankan proses CRUD dan menu pengelolaan data Barang, Pemasok, dan Pengadaan.
Untuk data Barang terdapat:
- menuBarang
- tambahBarang
- tampilkanBarang
- hapusBarang
- updateStok
Untuk data Pemasok terdapat:

- menuPemasok
- tambahPemasok
- tampilkanPemasok
- hapusPemasok
- updatePemasok

Untuk data Pengadaan terdapat:

- menuPengadaan
- tambahPengadaan
- tampilkanPengadaan
- hapusPengadaan
- updatePengadaan

3. Barang
   
   <img width="443" height="158" alt="image" src="https://github.com/user-attachments/assets/6e5346a9-ef38-429e-9fde-9ef1df347b13" />


  Keterangan atribut:
- idBarang digunakan sebagai identitas barang.
- nama digunakan untuk menyimpan nama barang.
- stok digunakan untuk menyimpan jumlah stok barang.

Class Barang memiliki constructor:

<img width="721" height="152" alt="image" src="https://github.com/user-attachments/assets/7cc5f462-7b3c-4b05-a56e-2827123d58b6" />

Class ini juga memiliki getter dan setter untuk mengakses serta mengubah nilai atribut, lalu validasi diterapkan pada atribut ID barang, nama barang, dan stok barang.

4. Pemasok

   <img width="439" height="159" alt="image" src="https://github.com/user-attachments/assets/ca125696-2dd9-4505-81db-7a1fe89ef27e" />


Class Pemasok merupakan class entitas yang digunakan untuk menyimpan data pemasok.

Class ini memiliki empat atribut, yaitu:
- idPemasok digunakan sebagai identitas pemasok.
- nama digunakan untuk menyimpan nama pemasok.
- alamat digunakan untuk menyimpan alamat pemasok.
- noTelepon digunakan untuk menyimpan nomor telepon pemasok.

Class Pemasok memiliki constructor:

<img width="975" height="166" alt="image" src="https://github.com/user-attachments/assets/94d94e3a-f9e5-4467-9f16-e237a4c54fd8" />

Class ini juga memiliki getter dan setter untuk setiap atribut, lalu validasi diterapkan pada ID pemasok, nama pemasok, alamat, dan nomor telepon.

5. Pengadaan

   <img width="460" height="132" alt="image" src="https://github.com/user-attachments/assets/6a533707-e985-406f-b640-cd0e4120853a" />

Class Pengadaan merupakan class entitas yang digunakan untuk menyimpan data pengadaan.
Class ini memiliki tiga atribut, yaitu:
-  idPengadaan digunakan sebagai identitas pengadaan.
-  tanggal digunakan untuk menyimpan tanggal pengadaan.
- alamat digunakan untuk menyimpan alamat pengadaan.

Class Pengadaan memiliki constructor:

<img width="975" height="166" alt="image" src="https://github.com/user-attachments/assets/64854227-915e-45d3-b3ed-e702d059f50c" />

Pada constructor tersebut, setTanggal digunakan agar validasi tanggal dilakukan ketika object Pengadaan dibuat, lalu class ini juga memiliki getter dan setter disetiap atribut.


## Fitur CRUD
1. Create 
Create merupakan proses untuk menambahkan data baru ke dalam program, lalu pada data Barang, user diminta memasukkan ID barang, nama barang, dan stok barang, setelah itu data yang dimasukkan kemudian digunakan untuk membuat object Barang.


Object yang telah dibuat kemudian dimasukkan ke dalam ArrayList<Barang> menggunakan method add(), lalu proses yang sama juga diterapkan pada data Pemasok dan Pengadaan. Data yang dimasukkan user digunakan untuk membuat object kemudian disimpan ke dalam ArrayList masing-masing.


2. Read
Read merupakan proses untuk menampilkan data yang telah tersimpan dan data yang terdapat dalam ArrayList ditampilkan menggunakan perulangan.
Contohnya pada data Barang:


Perulangan tersebut digunakan untuk mengambil setiap object barang yang terdapat dalam arrayList, lalu aata yang telah diambil kemudian ditampilkan kepada user, serta proses yang sama digunakan untuk menampilkan data Pemasok dan Pengadaan.

3. Update
Update merupakan proses untuk mengubah data yang telah tersimpan dan pada data barang, proses update digunakan untuk memperbarui stok barang berdasarkan ID barang. Selain itu, di beberapa class data lainnya proses update digunakan seperti berikut ini;
-	pada data Pemasok, proses update digunakan untuk memperbarui data pemasok berdasarkan ID pemasok.

- Pada data Pengadaan, proses update digunakan untuk memperbarui data pengadaan berdasarkan ID pengadaan.

-	user memasukkan ID data yang ingin diperbarui, lalu program akan mencari data berdasarkan ID tersebut dan mengubah nilai data yang dipilih.


4. Delete
Delete merupakan proses untuk menghapus data yang telah tersimpan, selain itu user memasukkan ID data yang ingin dihapus, lalu program akan mencari data berdasarkan ID tersebut.Jika data ditemukan, data akan dihapus dari ArrayList.
Proses delete diterapkan pada:
-  Data Barang
- Data Pemasok
- Data Pengadaan

##Alur Program
1. Menjalankan Program
Pada saat program dijalankan melalui class SistemmanajemenCVMPK, program membuat object scanner untuk menerima input dari user dan object service untuk menangani proses pengelolaan data.

<img width="668" height="116" alt="image" src="https://github.com/user-attachments/assets/94064e6f-ec30-4b9d-8825-d22b84afa352" />

Setelah itu, program masuk ke perulangan menu utama.

2. Menampilkan Menu Utama
   Program menampilkan menu utama;

   <img width="774" height="266" alt="image" src="https://github.com/user-attachments/assets/cdbd6f08-35de-4f48-9b55-b0bfd6ac6b8a" />

User dapat memilih menu dengan memasukkan angka 1 sampai dengan 4.
Disini di dalam menu utama terdapat beberapa opsi pilihan, yaitu;
- Kelola Data Barang
- Kelola Data Pemasok
- Kelola Data Pengadaan
- Keluar

3. Menu Barang
   
 Jika user memilih menu 1, program akan menjalankan:
 
<img width="774" height="266" alt="image" src="https://github.com/user-attachments/assets/cab041fb-e6d5-4e21-8d9a-aba23f97002d" />

Pada menu Barang, user dapat memilih proses:
- Tambah Barang
- Tampilkan Barang
- Hapus Barang
- Update Stok
- Kembali

4. Menu Pemasok
   
  Jika user memilih menu 2, program akan menjalankan:

 <img width="744" height="257" alt="image" src="https://github.com/user-attachments/assets/cc05bf04-aa04-4007-a6dc-fd732c74ec86" />


Pada menu Pemasok, user dapat melakukan proses:
- Tambah Pemasok
- Tampilkan Pemasok
- Hapus Pemasok
- Update Pemasok
- Kembali


5. Menu Pengadaan

   Jika user memilih menu 3, program akan menjalankan:

<img width="759" height="519" alt="image" src="https://github.com/user-attachments/assets/05898c9f-fcd0-4e00-91b6-7f40aea6495d" />


Pada menu Pengadaan, user dapat melakukan proses:
- Tambah Pengadaan
- Tampilkan Pengadaan
- Hapus Pengadaan
- Update Pengadaan
- Kembali

6. Menu Keluar

   Jika user memilih menu 4, program akan keluar dari sistem.

<img width="922" height="457" alt="image" src="https://github.com/user-attachments/assets/954065d7-1874-4fc4-a7d5-a1b0f9554513" />

   
   
