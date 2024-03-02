package jobsheet3;
import java.util.Scanner;

public class mainBangunRuang {
    public static void main(String[] args) {
    Scanner sc02 = new Scanner(System.in);

    System.out.print("Masukkan jumlah Ruang Bangun : ");
    int jml = sc02.nextInt();

    Kerucut krc2[] = new Kerucut[jml];
    LimasS4SamaSisi lms2[] = new LimasS4SamaSisi[jml];
    Bola bl2[] = new Bola[jml];

        for(int i = 0; i < jml ; i++){ //input dan object

            System.out.println("\nKerucut ke-" + (i+1));
            System.out.print("Jari-jari Kerucut = ");
            int rKerucut = sc02.nextInt();
            System.out.print("Sisi Miring Kerucut = ");
            int smKerucut = sc02.nextInt();

            krc2[i] = new Kerucut(rKerucut, smKerucut);

            System.out.println("\nLimas ke-" + (i+1));
            System.out.print("Sisi Alas Limas = ");
            int salimas = sc02.nextInt();
            System.out.print("Tinggi Limas = ");
            int tLimas = sc02.nextInt();

            lms2[i] = new LimasS4SamaSisi(salimas , tLimas);

            System.out.println("\nBola ke-" + (i+1));
            System.out.print("Jari-jari Bola = ");
            int rBola = sc02.nextInt();

            bl2[i] = new Bola(rBola);

        }

        for(int i = 0 ; i<jml ; i++){ 
            System.out.println("\nVol Kerucut ke-" + (i+1) + " = " + krc2[i].hitungVolume());
            System.out.println("Luas Permukaan Kerucut ke-" + (i+1) + " = " + krc2[i].hitungLuasPermukann());
            System.out.println("Vol Limas ke-" + (i+1) + " = " + lms2[i].hitungVolume());
            System.out.println("Luas Permukaan Limas ke-" + (i+1) + " = " + lms2[i].hitungLuasAlas());
            System.out.println("Vol Bola ke-" + (i+1) + "=" + bl2[i].hitungVolume());
            System.out.println("Luas Permukaan Bola ke-" + (i+1) + "=" + bl2[i].hitungLuasPermukann());
        }
    }

}
