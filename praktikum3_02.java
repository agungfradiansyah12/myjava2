package jobsheet1;


import java.util.Scanner;

public class praktikum3_02 {

    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        int jmlMatkul;

        System.out.print("Masukkan jumlah matakuliah pada tahun lalu: ");
        jmlMatkul = sc02.nextInt();
        sc02.nextLine();
        
        String[] namaMatkul = new String[jmlMatkul];
        int[] nilaiAngka = new int[jmlMatkul];
        int[] sksMatkul = new int[jmlMatkul];
        String[] nilaiHuruf = new String[jmlMatkul];
        double[] nilaiSetara = new double[jmlMatkul];
        double[] nilaiMutu = new double[jmlMatkul];

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("-------------------------------------");

            System.out.print("Masukkan nama matakuliah: ");
            namaMatkul[i] = sc02.nextLine();

            System.out.print("Masukkan nilai angka: " );
            nilaiAngka[i] = sc02.nextInt();

            System.out.print("Masukkan SKS matakuliah: ");
            sksMatkul[i] = sc02.nextInt();

            System.out.print("Masukkan nilai huruf matakuliah: ");
            nilaiHuruf[i] = sc02.next();

            switch (nilaiHuruf[i]) {
                case "A":
                    nilaiSetara[i] = 4.0;
                    break;
                case "B+":
                    nilaiSetara[i] = 3.5;
                    break;
                case "B":
                    nilaiSetara[i] = 3.0;
                    break;
                case "C+":
                    nilaiSetara[i] = 2.5;
                    break;
                case "C":
                    nilaiSetara[i] = 2.0;
                    break;
                case "D":
                    nilaiSetara[i] = 1.0;
                    break;
                default:
                    nilaiSetara[i] = 0.0;
            }

            nilaiMutu[i] = nilaiSetara[i] * sksMatkul[i];

            sc02.nextLine();
        }

        double totalNilaiMutu = 0.0;
        int totalSks = 0;
        for (int i = 0; i < jmlMatkul; i++) {
            totalNilaiMutu += nilaiMutu[i];
            totalSks += sksMatkul[i];
        }

        double ipSemester = totalNilaiMutu / totalSks;

        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("---------------------------------------------------------------------------------");
        System.out.printf("| %-50s | %-10s \t| %-5s \t| %-5s \t| %-10s \t| %-10s \t|\n", "MK", "Nilai Angka", "SKS", "Nilai Huruf", "Nilai Setara", "Nilai Mutu");
        System.out.println("---------------------------------------------------------------------------------");
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.printf("| %-50s | %-10s \t| %-5d \t| %-5s \t| %-10.2f \t| %-10.2f \t|\n", namaMatkul[i], nilaiAngka[i], sksMatkul[i], nilaiHuruf[i], nilaiSetara[i], nilaiMutu[i]);
        }

        System.out.println("-------------------------------------");
        System.out.printf("Total SKS: %d\n", totalSks);
        System.out.printf("Total Nilai Mutu: %.2f\n", totalNilaiMutu);

        System.out.println("-------------------------------------");
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        System.out.println("-------------------------------------");
    }
}