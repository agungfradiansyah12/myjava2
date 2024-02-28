package jobsheet2;
/**
 * BukuMain02
 */
public class BukuMain02 {
    public static void main(String[] args) {
        buku02 bk1 = new buku02();
        bk1.judul = "Today Ends Tommorow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198 ;
        bk1.stok = 13;
        bk1.harga = 71000;
        

        bk1.tampilInformasi();
        bk1.terjual(5);
        System.out.println("Harga Total: " + bk1.hitungHargaTotal(5));
        System.out.println("Diskon: " + bk1.hitungDiskon(5));
        System.out.println("hitung harga bayar : " + bk1.hitungHargaBayar(11));
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        System.out.println("========");
        System.out.println();
        buku02 bk2 = new buku02("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        System.out.println("========");
        System.out.println();
        buku02 agung02 = new buku02("Menuju Sukses", "agung", 180, 10, 50000);
        agung02.terjual(7);
        agung02.tampilInformasi();
    }
    
}