/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugascrud;

import java.util.Scanner;

/**
 *
 * @author NandaFrdika
 * TGL : 2024 - 5 - 10
 */
public class tugas2 {
    
    private static int length;
    private int brs = 10;
    private int klm = 4;
    private int raktif = 0;
    private String[][] BT = new String[brs][klm];
    
    Scanner dtIN = new Scanner(System.in);
    
    public void Storedata(){
        int idx = 0;
        raktif++;
        if(raktif > brs){
            System.out.println("Data Sudah Penuh");
            return;
        }
        if(raktif > 0){
            idx=raktif-1;    
        }
        System.out.println("Menambahkan Nama Mahasiswa");
        System.out.println("#======================#");
        System.out.print("Nama Mahasiswa      : ");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.print("Alamat Mahasiswa    : ");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.print("No.Telp Mahasiswa   : ");
        BT[idx][2] = dtIN.nextLine();
        
        System.out.print("Nim Mahasiswa       : ");
        BT[idx][3] = dtIN.nextLine();
    }
    
    public void Update(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        System.out.println("Mengubah Data Teman");
        System.out.println("#======================#");
        System.out.print("Nama Mahasiswa    : ");
        BT[idx][0] = dtIN.nextLine();

        System.out.print("Alamat Mahasiswa  : ");
        BT[idx][1] = dtIN.nextLine();

        System.out.print("No Telp Mahasiswa : ");
        BT[idx][2] = dtIN.nextLine();
        
        System.out.print("Nim Mahasiswa     : ");
        BT[idx][3] = dtIN.nextLine();
    }

    public void Destroy(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        for(int i = idx; i < raktif - 1; i++){
            BT[i][0] = BT[i + 1][0];
            BT[i][1] = BT[i + 1][1];
            BT[i][2] = BT[i + 1][2];
            BT[i][2] = BT[i + 1][3];
        }
        raktif--;
        System.out.println("Data Teman berhasil dihapus.");
    }

    public void Viewdata(){
        System.out.println("Data Mahasiswa");
        System.out.println("---------->");
        int no = 0;
        for(int i=0; i<raktif; i++){
            no++;
            System.out.println(no+". Nama Mahasiswa    : "+BT[i][0]);
            System.out.println("   Alamat Mahasiswa  : "+BT[i][1]);
            System.out.println("   No.Telp Mahasiswa : "+BT[i][2]);
            System.out.println("   Nim Mahasiswa     : "+BT[i][3]);
        }
 }
}
