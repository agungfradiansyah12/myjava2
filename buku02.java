package jobsheet2;
public class buku02 {
    String judul, pengarang;
    int halaman, stok, harga;

    public buku02(){

    }

    public buku02(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul: "+judul);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Jumlah Halaman: "+halaman);
        System.out.println("Sisa Stok: "+stok);
        System.out.println("Harga: Rp. "+harga);
    }

    void terjual (int jml){
        if (stok >0 &&  stok >= jml) {
            stok -= jml; 
            int totalHarga = hitungHargaTotal(jml);
        }
        else {
            stok = 0;
        }
    }

    void restok (int jml){
        stok += jml;
    }

    void gantiHarga (int hrg){
        harga = hrg;
    }

    int hitungHargaTotal(int jml){
        return harga * jml;
    }

    int hitungDiskon(int jml){
        int diskon = 0;
        int hargaTotal =hitungHargaTotal(jml);
        if (hargaTotal>150000) {
            diskon = (int)(0.12*hargaTotal);
        }else if(hargaTotal<150000 && hargaTotal>=75000){
            diskon = (int)(0.05*hargaTotal);
        }else
            diskon=0;
        
        return diskon;
    }


    int hitungHargaBayar(int jml){
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
    
}