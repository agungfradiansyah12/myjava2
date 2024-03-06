package kuis1Agung;

import java.util.Scanner;

public class mainMobil {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan jumlah data mobil : ");
        int dataMobil = sc02.nextInt();

        mobil mobilArray[] = new mobil[dataMobil];

        for (int i = 0 ; i <dataMobil ; i++){
            System.out.println("Masukkan Data Mobil " + (i + 1));
            System.out.print("Masukkan Nama\t\t: ");
            String nMobil = sc02.next();
            System.out.print("Masukkan CC\t\t: ");
            int cMobil = sc02.nextInt();
            System.out.print("Masukkan Harga Beli\t\t: ");
            int hMobil = sc02.nextInt();
            System.out.print("Masukkan Tahun Produksi\t\t: ");
            int thnMobil = sc02.nextInt();
            System.out.println();
            sc02.nextLine();

            mobilArray[i] = new mobil(nMobil, cMobil, hMobil, thnMobil);
        }

        double pajak = mobilArray[0].hitungPajak();
        double biayaPerawatan = mobilArray[0].hitungBiayaPerawatan();
        double biayaTotal = mobilArray[0].hitungBiayaTotal();

        System.out.println("=====================================");
        System.out.println("DATA MOBIL");
        System.out.println("=====================================");

        int urutan = 1 ;
        for(mobil m : mobilArray){
            System.out.println("___________________________________");
            System.out.println("Data Mobil ke-" + (urutan++));
            System.out.println("___________________________________");
            mobilArray[0].printData();
            System.out.println();
        }

        double rataRataBiayaPerawatan2010 = mobilArray[0].hitungRataRataBiayaPerawatan(mobilArray);
        System.out.println("==================================================================");
        System.out.println("Rata-rata Biaya Perawatan Mobil tahun produksi > 2010: " + rataRataBiayaPerawatan2010);
        System.out.println("==================================================================");

        mobil mobilTerbesar = mobilArray[0].mobilBiayaTotalTerbesar(mobilArray);
        if (mobilTerbesar != null) {
            System.out.println("================================");
            System.out.println("Mobil dengan Biaya Total Terbesar");
            System.out.println("================================");
            mobilTerbesar.printData();
        } else {
            System.out.println("Tidak ada mobil yang memenuhi kriteria");
        }

    }
}
