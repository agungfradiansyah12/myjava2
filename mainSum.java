package jobsheet4;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Missal 5.9) ");
        System.out.print("Masukkan Jumlah Bulan : ");
        int elm = sc02.nextInt();

        sum02 sm02 = new sum02(elm);
        System.out.println("=====================================================");
        for(int i = 0 ; i<sm02.elemen; i++){
            System.out.print("Masukkan untung bulan ke-" + (i+1)+ " = ");
            sm02.keuntungan[i] = sc02.nextDouble();
        }

        System.out.println("==============================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan perusahaan selama " + sm02.elemen + " bulan adalah = " + sm02.totalBF(sm02.keuntungan));
        System.out.println("==============================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total Keuntungan perusahaan selama " + sm02.elemen + " bulan adalah = " + sm02.totalDC(sm02.keuntungan,  0, sm02.elemen-1));
    }
}
