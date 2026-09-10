/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemmanajemencvmpk;

import model.Service;
import java.util.Scanner;

/**
 *
 * @author ASUS FC
 */
public class SistemmanajemenCVMPK {
    static Scanner scanner = new Scanner(System.in);
    static Service service = new Service(scanner);

    public static void main(String[] args) {
        
        boolean berjalan = true;

        while (berjalan) {

            System.out.println("\n==========================================================");
            System.out.println("       SISTEM MANAJEMEN CV MANDIRI PRIMA KREATIF");
            System.out.println("==========================================================");
            System.out.println("1. Kelola Data Barang");
            System.out.println("2. Kelola Data Pemasok");
            System.out.println("3. Kelola Data Pengadaan");
            System.out.println("4. Keluar");
            System.out.println("==========================================================");
            System.out.print("Pilih menu (1-4): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1 -> service.menuBarang();

                case 2 -> service.menuPemasok();

                case 3 -> service.menuPengadaan();

                case 4 -> {
                    berjalan = false;
                    System.out.println("\nTerima kasih telah menggunakan sistem manajemen CV MPK.");
                }

                default -> {
                    System.out.println("\n[!] Menu tidak tersedia.");
                }
            }
        }

        scanner.close();
    }
        
}

