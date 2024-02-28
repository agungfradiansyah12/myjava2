package jobsheet3;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        System.out.print("Masukkan panjang array : ");
        int pnjgArray = sc02.nextInt();

        PersegiPanjang[] ppArray = new PersegiPanjang[pnjgArray];

        for(int i = 0; i < ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc02.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc02.nextInt();
        }

        for(int i = 0; i < ppArray.length ; i++){
            System.out.println("Persegi Panjang ke-" +i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar : " + ppArray[i].lebar);
        }

        PersegiPanjang[][] ppArray2d = new PersegiPanjang[4][3];
        ppArray2d[0][1] = new PersegiPanjang();
        ppArray2d[0][1].panjang = 110;
        ppArray2d[0][1].lebar = 30;

        System.out.println();
        System.out.println("Persegi panjang ke [0][1] mempunyai " + "panjang :" + ppArray2d[0][01].panjang + ", lebar" + ppArray2d[0][1].lebar );

    }
}
