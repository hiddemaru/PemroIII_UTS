package com.assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      Deklarasi
        int nim;
        float uts, uas, mandiri, nilai_akhir;
        String nama, matkul;

//      Assignment with Scanner
        Scanner scanner = new Scanner(System.in);

//      Scanner
        System.out.println("INPUT");
        System.out.print("Masukan Mata Kuliah : ");
        matkul = scanner.nextLine();

        System.out.print("Masukan Nama : ");
        nama = scanner.nextLine();

        System.out.print("Masukan NIM : ");
        nim = scanner.nextInt();

        System.out.print("Masukan Nilai UTS : ");
        uts = scanner.nextInt();

        System.out.print("Masukan Nilai UAS : ");
        uas = scanner.nextInt();

        System.out.print("Masukan Tugas Mandiri : ");
        mandiri = scanner.nextInt();

//      Hitungan nilai akhir
        nilai_akhir = (uts*35/100) + (uas*45/100) + (mandiri*20/100);

//      Print
        System.out.println("\n");
        System.out.println("OUTPUT");
        System.out.println("Soal Essay Mata Kuliah Pemrograman III" );
        System.out.println("\n");
        System.out.println("NIM : "  + nim);
        System.out.println("Nama : "  + nama);
        System.out.println("Mata Kuliah : "  + matkul);
        System.out.println("Nilai UTS : "  + uts);
        System.out.println("Nilai UAS : "  + uas);
        System.out.println("Nilai Mandiri : "  + mandiri);
        System.out.println("Nilai Akhir : "  + nilai_akhir);

        // Rule If Else If
        if (nilai_akhir >= 80){
            System.out.println("Keterangan : A");
        }else if(nilai_akhir > 70){
            System.out.println("Keterangan : B");
        }else if(nilai_akhir >= 60){
            System.out.println("Keterangan : C");
        }else if(nilai_akhir >= 50){
            System.out.println("Keterangan : D");
        }else {
            System.out.println("Keterangan : E");
        }



    }
}
