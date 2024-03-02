package jobsheet1;

import java.util.Scanner;

public class praktikum4_02 {

    static int[][] stockBunga = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9},
    };

    static int[] hrgBunga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {

        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatanCabang += stockBunga[i][j] * hrgBunga[j];
            }
            System.out.println("Cabang " + (i + 1) + ": " + pendapatanCabang);
        }

        System.out.println("\nJumlah stock setiap jenis bunga pada cabang RoyalGarden:");
        for (int i = 0; i < hrgBunga.length; i++) {
            int totalStock = 0;
            for (int j = 0; j < stockBunga.length; j++) {
                totalStock += stockBunga[j][i];
            }
            System.out.println(namaBunga(i) + ": " + totalStock);
        }

        System.out.println("\nPengurangan stock bunga karena bunga mati:");
        int[] penguranganStock = {1, 2, 0, 5};
        for (int i = 0; i < penguranganStock.length; i++) {
            stockBunga[0][i] -= penguranganStock[i];
            System.out.println(namaBunga(i) + ": " + penguranganStock[i]);
        }

        System.out.println("\nStock bunga setelah pengurangan:");
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                System.out.print(stockBunga[i][j] + " ");
            }
            System.out.println();
        }
    }

    static String namaBunga(int jenisBunga) {
        switch (jenisBunga) {
            case 0:
                return "Aglonema";
            case 1:
                return "Keladi";
            case 2:
                return "Alocasia";
            case 3:
                return "Mawar";
            default:
                return "";
        }
    }
}
