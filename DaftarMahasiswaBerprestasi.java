package jobsheet5;

public class DaftarMahasiswaBerprestasi {
    mahasiswa listMhs02[] = new mahasiswa[3];
    int idx;

    void tambah (mahasiswa m){
        if(idx<listMhs02.length){
            listMhs02[idx] = m ;
            idx++ ;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }

    void tampil(){
        for (mahasiswa m : listMhs02){
            m.tampil();
            System.out.println("__________________________________");
        }
    }

    void bubbleSort(){
        for (int i=0; i<listMhs02.length-1; i++){
            for(int j=1; j<listMhs02.length-i; j++){
                if(listMhs02[j].ipk>listMhs02[j-1].ipk){
                    //proses swap
                    mahasiswa tmp = listMhs02[j];
                    listMhs02[j] = listMhs02[j-1];
                    listMhs02[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i=0; i<listMhs02.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j<listMhs02.length; j++){
                if(listMhs02[j].ipk < listMhs02[idxMin].ipk){
                    idxMin = j ;
                }
            }

            //swap
            mahasiswa tmp = listMhs02[idxMin];
            listMhs02[idxMin] =listMhs02[i];
            listMhs02[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs02.length; i++){
            mahasiswa temp = listMhs02[i];
            int j = i;
            while (j > 0 && listMhs02[j-1].ipk > temp.ipk) {
                listMhs02[j] = listMhs02[j-1];
                j--;
            }
            listMhs02[j]=temp;
        }
    }

}
