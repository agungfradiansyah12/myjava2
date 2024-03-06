package kuis1Agung;

public class mobil {
    String nama;
    int cc, hargaBeli, thnProduksi;

    mobil(String namaMobil, int ccMobil, int hargaBeliMobil, int thnProduksiMobil ){
        nama = namaMobil;
        cc = ccMobil;
        hargaBeli = hargaBeliMobil;
        thnProduksi = thnProduksiMobil;
    }

    double hitungPajak(){
        if (cc > 1500) {
            return hargaBeli * 0.1;
        } else {
            return hargaBeli * 0.075;
        }
    }

    double hitungBiayaPerawatan(){
        if (thnProduksi < 2010) {
            return hargaBeli * 0.08;
        } else {
            return hargaBeli * 0.05;
        }
    }

    double hitungBiayaTotal(){
        return hitungPajak()+hitungBiayaPerawatan();
    }

    static double hitungRataRataBiayaPerawatan(mobil[] mobilArray) {
        int jmlMobil2010 = 0;
        double totalBiayaPerawatan2010 = 0;

        for (mobil m : mobilArray) {
            if (m.thnProduksi > 2010) {
                jmlMobil2010++;
                totalBiayaPerawatan2010 += m.hitungBiayaPerawatan();
            }
        }

        if (jmlMobil2010 > 0) {
            return totalBiayaPerawatan2010 / jmlMobil2010;
        } else {
            return 0; 
        }
    }

    static mobil mobilBiayaTotalTerbesar(mobil[] mobilArray) {
        mobil mobilTerbesar = null;
        double biayaTotalTerbesar = 0;

        for (mobil m : mobilArray) {
            if (m.cc > 1500 && m.thnProduksi < 2010) {
                double biayaTotal = m.hitungBiayaTotal();
                if (biayaTotal > biayaTotalTerbesar) {
                    biayaTotalTerbesar = biayaTotal;
                    mobilTerbesar = m;
                }
            }
        }

        return mobilTerbesar;
    }

    void printData(){
        System.out.println("Nama Mobil \t\t: " + nama);
        System.out.println("CC Mobil \t\t: " + cc);
        System.out.println("Harga Beli Mobil \t\t: " + hargaBeli);
        System.out.println("Tahun Produksi Mobil \t\t: " + thnProduksi);
        System.out.println("Pajak Mobil \t\t: " + hitungPajak());
        System.out.println("Biaya Perawatan Mobil \t\t: " + hitungBiayaPerawatan());
        System.out.println("Biaya Total Mobil \t\t: " + hitungBiayaTotal());
    }
    
}
