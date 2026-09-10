/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private ArrayList<Barang> menuBarang;
    private ArrayList<Pemasok> menuPemasok;
    private ArrayList<Pengadaan> menuPengadaan;
    
    
    private Scanner scanner;
    
    public Service(Scanner scanner){
        this.menuBarang = new ArrayList<>();
        this.menuPemasok = new ArrayList<>();
        this.menuPengadaan = new ArrayList<>();
        this.scanner = scanner;
    }
    
    public void tambahBarang(){
        System.out.print("ID Barang: "); 
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Barang: "); 
        String nama = scanner.nextLine();

        System.out.print("Stok Barang: "); 
        int stok = scanner.nextInt();
        scanner.nextLine();

        Barang barangBaru = new Barang(id,nama , stok);

        menuBarang.add(barangBaru);

        System.out.println(">> Barang baru berhasil ditambahkan!");
    }
    public void tampilkanBarang() {
    if (menuBarang.isEmpty()) {
        System.out.println(">> Data barang masih kosong!");
        return;
    }

    System.out.println("\n--- DAFTAR BARANG ---");
    for (int i = 0; i < menuBarang.size(); i++) {
        Barang b = menuBarang.get(i);
        System.out.println((i + 1) + ". ID: " + b.getIdBarang() + 
                           " | Nama: " + b.getNama() + 
                           " | Stok: " + b.getStok());
    }
}
    public void hapusBarang(){
        System.out.print("Masukkan ID Barang: ");
        int idTarget = scanner.nextInt();

        for(int i = 0; i < menuBarang.size(); i++){
            if(menuBarang.get(i).getIdBarang() == idTarget){    
                menuBarang.remove(i);
                System.out.println(">> Barang berhasil dihapus!");
                break;
            }
        }
    }
    public void updateStok(){
        System.out.print("Masukkan ID Barang: ");
        int idTarget = scanner.nextInt();

        for (Barang b : menuBarang){
            if(b.getIdBarang() == idTarget){
                System.out.println("Stok Baru: ");
                int stokBaru = scanner.nextInt(); 
                b.setStok(stokBaru);
                System.out.println(">> Stok barang berhasil diperbarui!");
                return;
            }
        }
    }
    public void menuBarang() {

    boolean kembali = false;

    while (!kembali) {

        System.out.println("\n=================================");
        System.out.println("         KELOLA DATA BARANG        ");
        System.out.println("===================================");
        System.out.println("1. Tambah Barang                   ");
        System.out.println("2. Tampilkan Barang                ");
        System.out.println("3. Hapus Barang                    ");
        System.out.println("4. Update Stok                     ");
        System.out.println("5. Kembali                         ");
        System.out.println("===================================");
        System.out.print("Pilih menu:                          ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> tambahBarang();
            case 2 -> tampilkanBarang();
            case 3 -> hapusBarang();
            case 4 -> updateStok();
            case 5 -> kembali = true;
            default -> System.out.println("Pilihan tidak valid!");
        }
       
    }
}
    public void menuPemasok() {

    boolean kembali = false;

    while (!kembali) {

        System.out.println("\n=================================");
        System.out.println("         KELOLA DATA PEMASOK       ");
        System.out.println("===================================");
        System.out.println("1. Tambah Pemasok                  ");
        System.out.println("2. Tampilkan Pemasok               ");
        System.out.println("3. Hapus Pemasok                   ");
        System.out.println("4. Update Pemasok                  ");
        System.out.println("5. Kembali                         ");
        System.out.println("===================================");
        System.out.print("Pilih menu:                          ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> tambahPemasok();
            case 2 -> tampilkanPemasok();
            case 3 -> hapusPemasok();
            case 4 -> updatePemasok();
            case 5 -> kembali = true;
            default -> System.out.println("Pilihan tidak valid!");
        }
    }
    }
    public void tambahPemasok(){
        System.out.print("ID Pemasok: "); 
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Pemasok: "); 
        String nama = scanner.nextLine();

        System.out.print("Alamat Pemasok: "); 
        String alamat = scanner.nextLine();

        System.out.print("No Telepon "); 
        String noTelepon = scanner.nextLine();
        
        Pemasok pemasokBaru = new Pemasok(id,nama,alamat,noTelepon);

        menuPemasok.add(pemasokBaru);

        System.out.println(">> Pemasok baru berhasil ditambahkan!");
    }
    public void tampilkanPemasok(){
        for (int i = 0; i < menuPemasok.size(); i++) {
            Pemasok P = menuPemasok.get(i);
            System.out.println("ID Pemasok: " + P.getIdPemasok());
            System.out.println("Nama Pemasok: " + P.getNama());
            System.out.println("No Telepon: " + P.getnoTelepon());
            System.out.println("Alamat Pemasok: " + P.getalamat());
        }
        System.out.println("\n--- DAFTAR PEMASOK ---");
    for (int i = 0; i < menuPemasok.size(); i++) {
        Pemasok P = menuPemasok.get(i);
        System.out.println("ID Pemasok    : " + P.getIdPemasok());
        System.out.println("Nama Pemasok  : " + P.getNama());
        System.out.println("No Telepon    : " + P.getnoTelepon()); 
        System.out.println("Alamat Pemasok: " + P.getalamat());    
        System.out.println("----------------------------------");
        }
    }
    public void hapusPemasok(){
        System.out.print("Masukkan ID pemasok: ");
        int idTarget = scanner.nextInt();

        for(int i = 0; i < menuPemasok.size(); i++){
            if(menuPemasok.get(i).getIdPemasok() == idTarget){    
                menuPemasok.remove(i);
                System.out.println(">> Pemasok berhasil dihapus!");
                break;
            }
        }
    }
    public void updatePemasok(){
        System.out.print("Masukkan ID Pemasok: ");
        int idTarget = scanner.nextInt();
        scanner.nextInt();

        for (Pemasok P : menuPemasok){
            if(P.getIdPemasok() == idTarget){
                System.out.print("Masukkan nama: ");
                String namaBaru = scanner.nextLine(); 
                
                System.out.print("Masukkan no telepon: ");
                String noTelepon = scanner.nextLine(); 
                
                System.out.print("Masukkan alamat: ");
                String Alamat = scanner.nextLine(); 
                
                P.setNama(namaBaru);
                P.setnoTelepon(noTelepon);
                P.setalamat(Alamat);
                
                System.out.println(">> Data pemasok berhasil diperbarui!");
                return;
                
            }
        }
        System.out.println("ID pemasok tidak ditemukan");
    }
    public void menuPengadaan() {

    boolean kembali = false;

    while (!kembali) {

        System.out.println("\n=================================");
        System.out.println("       KELOLA DATA PENGADAAN       ");
        System.out.println("===================================");
        System.out.println("1. Tambah Pengadaan                ");
        System.out.println("2. Tampilkan Pengadaan             ");
        System.out.println("3. Hapus Pengadaan                 ");
        System.out.println("4. Update Pengadaan                ");
        System.out.println("5. Kembali                         ");
        System.out.println("===================================");
        System.out.print("Pilih menu:                          ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1 -> tambahPengadaan();
            case 2 -> tampilkanPengadaan();
            case 3 -> hapusPengadaan();
            case 4 -> updatePengadaan();
            case 5 -> kembali = true;
            default -> System.out.println("Pilihan tidak valid!");
        }
    }
    }
    public void tambahPengadaan(){
        System.out.print("ID Pengadaan: "); 
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tanggal (DD/MM/YYYY): "); 
        String tanggal = scanner.nextLine();

        System.out.print("Alamat: "); 
        String alamat = scanner.nextLine();
        
        Pengadaan pengadaanBaru = new Pengadaan(id,tanggal,alamat);

        menuPengadaan.add(pengadaanBaru);

        System.out.println(">> Pengadaan baru berhasil ditambahkan!");
    }
    public void tampilkanPengadaan(){
        for (int i = 0; i < menuPengadaan.size(); i++) {
            Pengadaan P = menuPengadaan.get(i);
            System.out.println("ID Pengadaan: " + P.getIdPengadaan());
            System.out.println("Tanggal Pengadaan: " + P.getTanggal());
            System.out.println("Alamat Pengadaan: " + P.getAlamat());
        }
        System.out.println("\n--- DAFTAR PENGADAAN ---");
    for (int i = 0; i < menuPengadaan.size(); i++) {
        Pengadaan P = menuPengadaan.get(i);
        System.out.println("ID Pengadaan     : " + P.getIdPengadaan());
        System.out.println("Tanggal Pengadaan: " + P.getTanggal());
        System.out.println("Alamat Pengadaan : " + P.getAlamat());
        System.out.println("----------------------------------");
        }
    }
    public void hapusPengadaan(){
        System.out.print("Masukkan ID pengadaan: ");
        int idTarget = scanner.nextInt();
        
        boolean ditemukan = false;
        for(int i = 0; i < menuPengadaan.size(); i++){
            if(menuPengadaan.get(i).getIdPengadaan() == idTarget){    
                menuPengadaan.remove(i);
                System.out.println(">> Pengadaan berhasil dihapus!");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println(">>ID pengadaan tidak ditemukan");
        }
    }
    public void updatePengadaan(){
        System.out.print("Masukkan ID Pengadaan: ");
        int idTarget = scanner.nextInt();
        scanner.nextInt();

        for (Pengadaan P : menuPengadaan){
            if(P.getIdPengadaan() == idTarget){
                
                System.out.print("Masukkan Tanggal: ");
                String Tanggal = scanner.nextLine(); 
                
                System.out.print("Masukkan alamat: ");
                String Alamat = scanner.nextLine(); 
                
                P.setTanggal(Tanggal);
                P.setAlamat(Alamat);
                
                System.out.println(">> Data pengadaan berhasil diperbarui!");
                return;
                
            }
        }
        System.out.println(">> ID Pengadaan tidak ditemukan!");
    }
    
}


