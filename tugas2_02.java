package jobsheet1;

import java.util.Scanner;

public class tugas2_02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        int pilihan;
        System.out.println("Menu:");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = sc02.nextInt();

        while (pilihan != 4) {
            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
            System.out.println("Menu:");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc02.nextInt();
        }
        System.out.println("Terimakasih");
    }

    static void hitungKecepatan() {
        Scanner sc02 = new Scanner(System.in);
        System.out.print("Masukkan jarak (m): ");
        double jarak = sc02.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = sc02.nextDouble();
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan: " + kecepatan + " m/s");
    }

    static void hitungJarak() {
        Scanner sc02 = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = sc02.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = sc02.nextDouble();
        double jarak = kecepatan * waktu;
        System.out.println("Jarak: " + jarak + " m");
    }

    static void hitungWaktu() {
        Scanner sc02 = new Scanner(System.in);
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = sc02.nextDouble();
        System.out.print("Masukkan jarak (m): ");
        double jarak = sc02.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu + " s");
    }
}