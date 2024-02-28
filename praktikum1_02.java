import java.util.Scanner;

public class praktikum1_02{
    public static void main(String[] args) {
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc02.nextInt();

        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc02.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc02.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc02.nextInt();

        if (tugas <0 || tugas >100 || kuis <0 || kuis >100 || uts <0 || uts >100 ||uas <0 || uas >100 ) {
            System.out.println("Nilai tidak valid");
            System.out.println("================================");
            System.out.println("================================");
        }

        double nilaiAkhir = 0.1*tugas  + 0.2*kuis + 0.3*uts + 0.4*uas;

        String nilaiHuruf;
        String ket;
        if (nilaiAkhir >80 && nilaiAkhir <=100 ) {
            nilaiHuruf = "A";
            ket = "LULUS";
        }else if (nilaiAkhir >73 && nilaiAkhir <=80) {
            nilaiHuruf = "B+";
            ket = "LULUS";
        }else if (nilaiAkhir >65 && nilaiAkhir <=73) {
            nilaiHuruf = "B";
            ket = "LULUS";
        }else if (nilaiAkhir >60 && nilaiAkhir <=65) {
            nilaiHuruf = "C+";
            ket = "LULUS";
        }else if (nilaiAkhir >50 && nilaiAkhir <=60) {
            nilaiHuruf = "C";
            ket = "LULUS";
        }else if (nilaiAkhir >39 && nilaiAkhir <=50) {
            nilaiHuruf = "D";
            ket = "TIDAK LULUS";
        }else {
            nilaiHuruf = "E";
            ket = "TIDAK LULUS";
        }

        System.out.println("================================");
        System.out.println("================================");

        System.out.println("nilai akhir : " + nilaiAkhir);
        System.out.println("nilai huruf : " + nilaiHuruf);

        System.out.println("================================");
        System.out.println("================================");

        if (nilaiHuruf.equalsIgnoreCase("A")||nilaiHuruf.equalsIgnoreCase("B+")||nilaiHuruf.equalsIgnoreCase("B")
        ||nilaiHuruf.equalsIgnoreCase("C+")||nilaiHuruf.equalsIgnoreCase("C")) {
            System.out.println("SELAMAT ANDA LULUS");
        } else{
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
    }
}