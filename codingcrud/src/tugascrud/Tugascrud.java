/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugascrud;

import java.util.Scanner;

/**
 *
 * @author NandaFrdika
 * TGL : 2024 - 4 - 10
 */
public class Tugascrud {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tugas2 t2 = new tugas2();

        while (true) {
            System.out.println("MENAMBAHKAN DATA MAHASISWA");
            System.out.println("==========================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Edit Data Mahasiswa");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("0. Keluar");

            System.out.print("Pilihan Anda: ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    t2.Storedata();
                    break;
                case 2:
                    t2.Viewdata();
                    break;
                case 3:
                    System.out.print("Masukkan nomor ID mahasiswa yang ingin diubah: ");
                    int idxUpdate = input.nextInt();
                    t2.Update(idxUpdate - 1); // Ubah indeks dari user ke indeks array
                    break;
                case 4:
                    System.out.print("Masukkan nomor ID Mahasiswa yang ingin dihapus: ");
                    int idxDelete = input.nextInt();
                    t2.Destroy(idxDelete - 1); // Ubah indeks dari user ke indeks array
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Pilih nomor yang tertera pada menu.");
            }
        }
    }
  }

        

   
    
       

