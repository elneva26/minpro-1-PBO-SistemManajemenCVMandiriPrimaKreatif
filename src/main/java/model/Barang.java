/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Barang {

    private int idBarang;
    private String nama;
    private int stok;

    public Barang(int idBarang, String nama, int stok) {
        this.idBarang = idBarang;
        this.nama = nama;
        this.stok = stok;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int barang) {
        if (barang <= 0) {
            System.out.println("ID barang tidak valid");
            return;
        }
        this.idBarang = barang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            System.out.println("Nama barang tidak valid");
            return;
        }
        this.nama = nama;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        if (stok < 0) {
            System.out.println("Stok tidak valid");
            return;
        }
        this.stok = stok;
    }
}

