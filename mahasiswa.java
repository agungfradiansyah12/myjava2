package jobsheet3;

public class mahasiswa {
    String nim, nama, jenisKelamin;
    double IPK;

    mahasiswa(String nm, String ni, String jK, double ipk){
        nama = nm;
        nim = ni;
        jenisKelamin = jK;
        IPK = ipk;
    }

    void print(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Jenis Kelamin = " + jenisKelamin);
        System.out.println("IPK = " + IPK);
    }

    public String nama(){
        return nama;
    }

    public String nim(){
        return nim;
    }

    public String jenisKelamin(){
        return jenisKelamin;
    }

    public double nilai_ipk(){
        return IPK;
    }

    public double hitungRataRataIPK(mahasiswa[] mhs) {
        double totalIPK = 0;
        for (mahasiswa student : mhs) {
            totalIPK += student.nilai_ipk();
        }
        return totalIPK / mhs.length;
    }

    public static mahasiswa temukanSiswaDenganIPKTerbaik(mahasiswa[] mhs) {
        mahasiswa mhsIPKTerbaik = mhs[0];
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].nilai_ipk() > mhsIPKTerbaik.nilai_ipk()) {
                mhsIPKTerbaik = mhs[i];
            }
        }
        return mhsIPKTerbaik;
    }

    
    
}
