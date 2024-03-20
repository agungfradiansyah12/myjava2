package jobsheet5;

public class mainMhs {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list02 = new DaftarMahasiswaBerprestasi();
        mahasiswa m1 = new mahasiswa("Nusa", 2017, 25, 3);
        mahasiswa m2 = new mahasiswa("Rara", 2012, 19, 4);
        mahasiswa m3 = new mahasiswa("Dompu", 2018, 19, 3.5);
        mahasiswa m4 = new mahasiswa("Abdul", 2017, 23, 2);
        mahasiswa m5 = new mahasiswa("Ummi", 2019, 21, 3.75);

        list02.tambah(m1);
        list02.tambah(m2);
        list02.tambah(m3);
        list02.tambah(m4);
        list02.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list02.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list02.bubbleSort();
        list02.tampil();

        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        list02.selectionSort();;
        list02.tampil();
        
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk (insertionSort)");
        list02.insertionSort();
        list02.tampil();
    }
}
