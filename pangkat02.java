package jobsheet4;

public class pangkat02{
    public int nilai, pangkat;

    public pangkat02(int Nilai, int Pangkat){
        Nilai = nilai;
        Pangkat = pangkat;
    }

    int pangkatBF(int a, int n){
        int hasil = 1;
        for (int i = 1; i<=n ; i++){
            hasil *= a;
        } 
        return hasil;
    }

    int pangkatDC(int a, int n){
        if(n==1){
            return a;
        }else{
            if(n%2==0){
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }
        }
    }
    
}