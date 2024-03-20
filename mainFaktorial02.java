package jobsheet4;

import java.util.Scanner;

public class mainFaktorial02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc02.nextInt();

        faktorial02[] fk02 = new faktorial02[iJml];
        for(int i = 0; i < iJml; i ++){
            fk02[i] = new faktorial02();
            System.out.println("Masukkan nilai data ke-" + (i+1) + ":");
            int iNilai = sc02.nextInt();
            fk02[i].nilai= iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++){
            System.out.println("Hasil penghitungan faktorial mengunakan Brute Force adalah "
            + fk02[i].faktorialBF(fk02[i].nilai));
        } 
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i=0 ; i<iJml;i++){
            System.out.println(
                "Hasil penghitungan faktorial menggunakan Divide and Conquer adalah "
                + fk02[i].faktorialDC(fk02[i].nilai)
            );
        }
    }
}
