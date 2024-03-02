package jobsheet3;

import java.util.Scanner;

public class mainMhs {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        mahasiswa mhs02[] = new mahasiswa[3];

        for (int i = 0; i < mhs02.length; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            
            System.out.print("Masukkan Nama : ");
            String nama = sc02.nextLine();

            System.out.print("Masukkan NIM : ");
            String nim = sc02.nextLine();

            System.out.print("Masukkan Jenis Kelamin : ");
            String jkcoba = sc02.nextLine();

            System.out.print("Masukkan Nilai IPK : ");
            double ipk = sc02.nextDouble();

            System.out.println();
            sc02.nextLine();

            mhs02[i] = new mahasiswa(nama, nim, jkcoba, ipk);
        }

        double rataRataIPK = mhs02[0].hitungRataRataIPK(mhs02);
        mahasiswa mhsIPKTerbaik = mhs02[0].temukanSiswaDenganIPKTerbaik(mhs02);


        for(int i=0 ; i<mhs02.length; i++){
            System.out.println();
            System.out.println("Data mahasiswa ke-" + (i+1));
            System.out.println("Nama : " + mhs02[i].nama);
            System.out.println("NIM : " + mhs02[i].nim());
            System.out.println("Jenis Kelamin : " + mhs02[i].jenisKelamin());
            System.out.println("Nilai IPK : " + mhs02[i].nilai_ipk());
        }

        System.out.println("\nRata-rata IPK: " + rataRataIPK);
        System.out.println("\nMahasiswa dengan IPK terbaik:");
        mhsIPKTerbaik.print();
    }
}

