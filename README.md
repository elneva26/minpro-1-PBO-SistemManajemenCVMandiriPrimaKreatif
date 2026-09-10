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
<img width="194" height="79" alt="image" src="https://github.com/user-attachments/assets/23fa6a73-f150-41af-8602-c128604ebc8e" />

Keterangan atribut:

* idBarang digunakan sebagai identitas barang.
* nama digunakan untuk menyimpan nama barang.
* stok digunakan untuk menyimpan jumlah stok barang.

Class Barang memiliki constructor:
<img width="334" height="73" alt="image" src="https://github.com/user-attachments/assets/355715eb-d390-4232-9a5c-6829e9fba138" />

Class ini juga memiliki getter dan setter untuk mengakses serta mengubah nilai atribut, lalu validasi diterapkan pada atribut ID barang, nama barang, dan stok barang.

4. Pemasok
<img width="214" height="79" alt="image" src="https://github.com/user-attachments/assets/84d3a5b1-a938-4884-844a-45cd18cbc1be" />

Class Pemasok merupakan class entitas yang digunakan untuk menyimpan data pemasok.

Class ini memiliki empat atribut, yaitu:
* idPemasok digunakan sebagai identitas pemasok.
* nama digunakan untuk menyimpan nama pemasok.
* alamat digunakan untuk menyimpan alamat pemasok.
* noTelepon digunakan untuk menyimpan nomor telepon pemasok.

Class Pemasok memiliki constructor:
<img width="482" height="88" alt="image" src="https://github.com/user-attachments/assets/6655de87-4590-4b16-8d75-d901e1d31b1c" />

Class ini juga memiliki getter dan setter untuk setiap atribut, lalu validasi diterapkan pada ID pemasok, nama pemasok, alamat, dan nomor telepon.

5. Pengadaan
<img width="197" height="65" alt="image" src="https://github.com/user-attachments/assets/6252db00-523f-4d9c-95ea-ea21013d7dfb" />

Class Pengadaan merupakan class entitas yang digunakan untuk menyimpan data pengadaan.
Class ini memiliki tiga atribut, yaitu:
* idPengadaan digunakan sebagai identitas pengadaan.
* tanggal digunakan untuk menyimpan tanggal pengadaan.
* alamat digunakan untuk menyimpan alamat pengadaan.

Class Pengadaan memiliki constructor:
<img width="416" height="78" alt="image" src="https://github.com/user-attachments/assets/31df7560-8f47-4950-bf59-f80b34352819" />

Pada constructor tersebut, setTanggal digunakan agar validasi tanggal dilakukan ketika object Pengadaan dibuat, lalu class ini juga memiliki getter dan setter disetiap atribut.

## Fitur CRUD
1. Create 
Create merupakan proses untuk menambahkan data baru ke dalam program, lalu pada data Barang, user diminta memasukkan ID barang, nama barang, dan stok barang, setelah itu data yang dimasukkan kemudian digunakan untuk membuat object Barang.

<img width="318" height="51" alt="image" src="https://github.com/user-attachments/assets/cb85fd55-8ac3-41b6-a809-56620493b3b0" />

Object yang telah dibuat kemudian dimasukkan ke dalam ArrayList<Barang> menggunakan method add(), lalu proses yang sama juga diterapkan pada data Pemasok dan Pengadaan. Data yang dimasukkan user digunakan untuk membuat object kemudian disimpan ke dalam ArrayList masing-masing.

2. Read
Read merupakan proses untuk menampilkan data yang telah tersimpan dan data yang terdapat dalam ArrayList ditampilkan menggunakan perulangan.
Contohnya pada data Barang:
<img width="393" height="100" alt="image" src="https://github.com/user-attachments/assets/a455e75c-935b-4c21-95cc-6d469c0f414f" />
Perulangan tersebut digunakan untuk mengambil setiap object barang yang terdapat dalam arrayList, lalu aata yang telah diambil kemudian ditampilkan kepada user, serta proses yang sama digunakan untuk menampilkan data Pemasok dan Pengadaan.

3. Update
<img width="441" height="183" alt="image" src="https://github.com/user-attachments/assets/f26ccee6-8ec3-4ea7-9c60-7d17d556d0cf" />

Update merupakan proses untuk mengubah data yang telah tersimpan dan pada data barang, proses update digunakan untuk memperbarui stok barang berdasarkan ID barang. Selain itu, di beberapa class data lainnya proses update digunakan seperti berikut ini;
* Pada data Pemasok, proses update digunakan untuk memperbarui data pemasok berdasarkan ID pemasok.
<img width="455" height="338" alt="image" src="https://github.com/user-attachments/assets/4187aa27-ca80-463c-8c7b-8bf4708e9c51" />


* Pada data Pengadaan, proses update digunakan untuk memperbarui data pengadaan berdasarkan ID pengadaan.
<img width="473" height="338" alt="image" src="https://github.com/user-attachments/assets/136c7849-02fe-4bb3-bd76-f20f4a21ba2d" />


* User memasukkan ID data yang ingin diperbarui. Program kemudian mencari data berdasarkan ID tersebut dan mengubah nilai data yang dipilih.

4. Delete
Delete merupakan proses untuk menghapus data yang telah tersimpan, selain itu user memasukkan ID data yang ingin dihapus, lalu program akan mencari data berdasarkan ID tersebut.Jika data ditemukan, data akan dihapus dari ArrayList.
Proses delete diterapkan pada:
* Data Barang
* Data Pemasok
* Data Pengadaan

##Alur Program
1. Menjalankan Program
Pada saat program dijalankan melalui class SistemmanajemenCVMPK, program membuat object scanner untuk menerima input dari user dan object service untuk menangani proses pengelolaan data.
<img width="325" height="54" alt="image" src="https://github.com/user-attachments/assets/80059f65-42a3-4072-a7ec-8dcb36b3cee1" />
Setelah itu, program masuk ke perulangan menu utama.

2. Menampilkan Menu Utama
Program menampilkan menu utama;
<img width="351" height="137" alt="image" src="https://github.com/user-attachments/assets/0490a088-d500-431e-9428-fee6004902fe" />
User dapat memilih menu dengan memasukkan angka 1 sampai dengan 4.
Disini di dalam menu utama terdapat beberapa opsi pilihan, yaitu;
- Kelola Data Barang
- Kelola Data Pemasok
- Kelola Data Pengadaan
- Keluar


3. Menu Barang
Jika user memilih menu 1, program akan menjalankan:
<img width="236" height="134" alt="image" src="https://github.com/user-attachments/assets/a3c8775e-00c5-43cb-aab8-8fb97d29e347" />
Pada menu Barang, user dapat memilih proses:
- Tambah Barang
- Tampilkan Barang
- Hapus Barang
- Update Stok
- Kembali
Menu tersebut digunakan untuk mengelola data barang yang tersimpan dalam ArrayList<Barang>.

4. Menu Pemasok
Jika user memilih menu 2, program akan menjalankan:
<img width="263" height="130" alt="image" src="https://github.com/user-attachments/assets/b78bccc4-568c-4a12-8634-6121357ace06" />
Pada menu Pemasok, user dapat melakukan proses:
- Tambah Pemasok
- Tampilkan Pemasok
- Hapus Pemasok
- Update Pemasok
- Kembali

5. Menu Pengadaan
Jika user memilih menu 3, program akan menjalankan:
<img width="230" height="129" alt="image" src="https://github.com/user-attachments/assets/20f29b97-9d95-4040-ab19-f75323562969" />
Pada menu Pengadaan, user dapat melakukan proses:
- Tambah Pengadaan
- Tampilkan Pengadaan
- Hapus Pengadaan
- Update Pengadaan
- Kembali

6. Menu Keluar
Jika user memilih menu 4, program akan keluar dari sistem
<img width="439" height="189" alt="image" src="https://github.com/user-attachments/assets/9608069c-3d3c-4d14-bdf0-97b2d83fc237" />















