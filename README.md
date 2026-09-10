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

**Screenshot:**

---

## 2. Service

Class `Service` digunakan untuk menangani proses pengelolaan data pada program.

Class ini menjadi tempat untuk menjalankan proses CRUD dan menu pengelolaan data Barang, Pemasok, dan Pengadaan.

Class `Service` memiliki tiga `ArrayList`, yaitu:

```java
private ArrayList<Barang> menuBarang;
private ArrayList<Pemasok> menuPemasok;
private ArrayList<Pengadaan> menuPengadaan;

Ketiga ArrayList tersebut digunakan untuk menyimpan object dari masing-masing class entitas.

Untuk data Barang terdapat:

menuBarang()
tambahBarang()
tampilkanBarang()
hapusBarang()
updateStok()

Untuk data Pemasok terdapat:

menuPemasok()
tambahPemasok()
tampilkanPemasok()
hapusPemasok()
updatePemasok()

Untuk data Pengadaan terdapat:

menuPengadaan()
tambahPengadaan()
tampilkanPengadaan()
hapusPengadaan()
updatePengadaan()

3. Barang
<img width="302" height="83" alt="image" src="https://github.com/user-attachments/assets/6b89b5b0-4625-411d-be0d-c37625a70c68" />
Keterangan atribut:

* idBarang digunakan sebagai identitas barang.
* nama digunakan untuk menyimpan nama barang.
* stok digunakan untuk menyimpan jumlah stok barang.

Class Barang memiliki constructor:
<img width="334" height="70" alt="image" src="https://github.com/user-attachments/assets/ddb41b2b-7c73-417f-bfd3-8310f5540662" />
Class ini juga memiliki getter dan setter untuk mengakses serta mengubah nilai atribut, lalu validasi diterapkan pada atribut ID barang, nama barang, dan stok barang.

4. Pemasok
<img width="221" height="80" alt="image" src="https://github.com/user-attachments/assets/c5ae9c2f-ca07-4b31-80c4-c3e85c8d34a2" />
Class Pemasok merupakan class entitas yang digunakan untuk menyimpan data pemasok.

Class ini memiliki empat atribut, yaitu:
* idPemasok digunakan sebagai identitas pemasok.
* nama digunakan untuk menyimpan nama pemasok.
* alamat digunakan untuk menyimpan alamat pemasok.
* noTelepon digunakan untuk menyimpan nomor telepon pemasok.

Class Pemasok memiliki constructor:
<img width="482" height="87" alt="image" src="https://github.com/user-attachments/assets/e00d7e9f-cd33-42b3-b9f0-5521bbd46236" />
Class ini juga memiliki getter dan setter untuk setiap atribut, lalu validasi diterapkan pada ID pemasok, nama pemasok, alamat, dan nomor telepon.

5. Pengadaan
<img width="192" height="65" alt="image" src="https://github.com/user-attachments/assets/19a88ff4-d8b2-4295-a931-4fd0218c5604" />
Class Pengadaan merupakan class entitas yang digunakan untuk menyimpan data pengadaan.
Class ini memiliki tiga atribut, yaitu:
* idPengadaan digunakan sebagai identitas pengadaan.
* tanggal digunakan untuk menyimpan tanggal pengadaan.
* alamat digunakan untuk menyimpan alamat pengadaan.

Class Pengadaan memiliki constructor:
<img width="432" height="82" alt="image" src="https://github.com/user-attachments/assets/54718ac5-6808-497d-ba24-0d1ebd217818" />
Pada constructor tersebut, setTanggal digunakan agar validasi tanggal dilakukan ketika object Pengadaan dibuat, lalu class ini juga memiliki getter dan setter disetiap atribut.







