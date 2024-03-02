package jobsheet1;

import java.util.Scanner;

public class MenghitungIPS {
    public static void main(String[] args) {

        Scanner sc23 = new Scanner(System.in);

        String[] matkul = { "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja" };
        int i = 0;
        int j = 0;
        int[] nilai = new int[matkul.length];
        String[] nilaiHuruf = new String[matkul.length];
        double[] nilaiSetara = new double[matkul.length];
        int[] sks = {2,2,2,3,2,2,3,3};

        // Array untuk konversi nilai
        String[] huruf = { "A", "B+", "B", "C+", "C", "D", "E" };
        double[] setara = { 4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0.0 };
        int[] nilaiBawah = { 80, 73, 65, 60, 50, 39, 0 };
        int[] nilaiAtas = { 100, 80, 73, 65, 60, 50, 39 };

        // Input nilai
        System.out.println("================================================================");
        System.out.println("Masukkan Nilai Nilai Matkul Untuk Mengetahui IP");
        System.out.println("================================================================");
        for (i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai " + matkul[i] + ": ");
            nilai[i] = sc23.nextInt();
            

            // Validasi nilai
            while (nilai[i] < 0 || nilai[i] > 100) {
                System.out.println("Maaf, nilai tidak valid! Masukkan nilai antara 0 dan 100: ");
                nilai[i] = sc23.nextInt();
            }
        }

        for (i = 0; i < matkul.length; i++) {
            int indexHuruf = 0;
            for (j = 0; j < nilaiBawah.length; j++) {
                if (nilai[i] > nilaiBawah[j] && nilai[i] <= nilaiAtas[j]) {
                    indexHuruf = j;
                    break;
                }
            }
            nilaiHuruf[i] = huruf[indexHuruf];
        }
        for (i = 0; i < matkul.length; i++) {
            int indexSetara = 0;
            for (j = 0; j < nilaiBawah.length; j++) {
                if (nilai[i] > nilaiBawah[j] && nilai[i] <= nilaiAtas[j]) {
                    indexSetara = j;
                    break;
                }
            }
            nilaiSetara[i] = setara[indexSetara];
        }

        // Menampilkan hasil
        System.out.println("================================================================");
        System.out.println("HASIL KONVERSI NILAI");
        System.out.println("================================================================");
        System.out.printf("%-40s%-14s%-14s%-14s\n", "Mata Kuliah", "Nilai", "Huruf", "Nilai Setara");
        for (i = 0; i < matkul.length; i++) {
            System.out.printf("%-40s%-14d%-14s%-14.2f\n", matkul[i], nilai[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        double totalNilai = 0;
        int totalSks = 0;
        for (i = 0; i < matkul.length; i++) {
            totalNilai += nilaiSetara[i] * sks[i];
            totalSks += sks[i];
        }

        double ipSemester = totalNilai / totalSks;

        System.out.println("================================================================");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        System.out.println("================================================================");
    }
}