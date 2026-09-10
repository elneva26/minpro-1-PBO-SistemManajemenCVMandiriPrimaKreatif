/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS FC
 */
public class Pengadaan {
    private int idPengadaan;
    private String tanggal;
    private String alamat;

    public Pengadaan(int idPengadaan, String tanggal, String alamat) {
        this.idPengadaan = idPengadaan;
        setTanggal(tanggal); // Memanggil setter agar validasi otomatis berjalan saat objek dibuat
        this.alamat = alamat;
    }

    // Getter & Setter ID
    public int getIdPengadaan() {
        return idPengadaan;
    }

    public void setIdPengadaan(int idPengadaan) {
        this.idPengadaan = idPengadaan;
    }

    // Getter & Setter Tanggal dengan Validasi
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        if (tanggal == null || tanggal.trim().isEmpty()) {
            System.out.println(">> Tanggal pengadaan tidak boleh kosong!");
            return;
        }
        this.tanggal = tanggal;
    }

    // Getter & Setter Alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}