/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ASUS FC
 */
public class Pemasok {
    private int idPemasok;
    private String nama;
    private String alamat;
    private String noTelepon;

    public Pemasok(int idPemasok, String nama, String alamat, String noTelepon) {
        this.idPemasok = idPemasok;
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
    }

    public int getIdPemasok() {
        return idPemasok;
    }

    public void setIdPemasok(int pemasok) {
        if (pemasok <= 0) {
            System.out.println("ID pemasok tidak valid");
            return;
        }
        this.idPemasok = pemasok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            System.out.println("Nama pemasok tidak valid");
            return;
        }
        this.nama = nama;
    }

    public String getnoTelepon() {
        return noTelepon;
    }

    public void setnoTelepon(String noTelepon) {
        if (noTelepon == null || noTelepon.isEmpty()) {
            System.out.println("Stok tidak valid");
            return;
        }
        this.noTelepon = noTelepon;
    }
    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        if (alamat == null || alamat.isEmpty()) {
            System.out.println("Alamat tidak tersedia");
            return;
        }
        this.alamat= alamat;
    }
}

