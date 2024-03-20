package jobsheet4;

import java.util.Scanner;

public class mainPangkat02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc02.nextInt();

        pangkat02[] png02 = new pangkat02[elemen];
        for(int i = 0; i < elemen ; i++){
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int inilai = sc02.nextInt();

            System.out.print("Masukkan nilai pemangkat: ");
            int ipangkat = sc02.nextInt();

            png02[i] = new pangkat02(inilai, ipangkat);
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i<elemen ; i++){
            System.out.println("Hasil dari "
            + png02[i].nilai + " pangkat "
            + png02[i].pangkat + " adalah "
            + png02[i].pangkatBF(png02[i].nilai, png02[i].pangkat)
            );
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
            for (int i = 0; i<elemen; i++){
                System.out.println(
                    "Hasil dari "
                    + png02[i].nilai + " pangkat "
                    + png02[i].pangkat + " adalah "
                    + png02[i].pangkatDC(png02[i].nilai, png02[i].pangkat)
                );
            }
    }
}
