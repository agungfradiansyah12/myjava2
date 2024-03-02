package jobsheet3;

public class Kerucut {
    int jari_jari;
    int sisiMiring;

    Kerucut(int j, int sm){
        jari_jari = j ;
        sisiMiring = sm;
    }

    double hitungVolume(){
        double vol = 0;
        double luasAlas = 3.14*jari_jari*jari_jari;
        double tinggi = Math.sqrt(Math.pow(sisiMiring, 2) -
                        Math.pow(jari_jari,2));
        vol = (1.0/3.0)*luasAlas*tinggi;
        return vol;
    }

    double hitungLuasPermukann(){
        double lp = 0;
        lp = 3.14*jari_jari*(jari_jari+sisiMiring);
        return lp;
    }
}
