package jobsheet3;

public class Bola {
    int jari_jari;

    Bola(int r){
        jari_jari = r ;
    }

    double hitungVolume(){
        double vol = 0;
        vol = (4.0/3.0)*3.14*jari_jari*jari_jari*jari_jari;
        return vol;
    }

    double hitungLuasPermukann(){
        double lp = 0;
        lp = 4*3.14*jari_jari*jari_jari;
        return lp;
    }
}
