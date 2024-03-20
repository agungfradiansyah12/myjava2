package jobsheet5;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list02 = new HotelService();
        Hotel h1 = new Hotel("Sumber Agung", "Probolinggo", 45000, (byte)3);
        Hotel h2 = new Hotel("Agung Abadi", "Gading", 65000, (byte)5);
        Hotel h3 = new Hotel("Agung Jaya", "Prasi", 55000, (byte)4);

        list02.tambah(h1);
        list02.tambah(h2);
        list02.tambah(h3);

        System.out.println("=======================================");
        System.out.println("Daftar Penginapan Hotel yang Tersedia");
        System.out.println("=======================================");

        System.out.println("Data Hotel sebelum sorting = ");
        System.out.println();
        list02.tampilAll();

        System.out.println("Data Hotel setelah sorting ascerding berdasarkan Harga");
        System.out.println();
        list02.selectionSortHarga();
        list02.tampilAll();

        System.out.println("Data Hotel setelah sorting desc berdasarkan Bintang");
        System.out.println();
        list02.bubbleSort();
        list02.tampilAll();
    }
}
