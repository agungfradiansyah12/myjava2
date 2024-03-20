package jobsheet5;

public class HotelService {
    Hotel listHtl02[] = new Hotel[3];
    int idx;

    void tambah(Hotel H){
        if (idx<listHtl02.length) {
            listHtl02[idx] = H;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampilAll(){
        for(Hotel H : listHtl02 ){
            H.tampil();
            System.out.println("_____________________");
            System.out.println();
        }
    }

    void bubbleSortHrg(){
        for (int i=0; i<listHtl02.length-1; i++){
            for(int j=1; j<listHtl02.length-i; j++){
                if(listHtl02[j].harga>listHtl02[j-1].harga){
                    //proses swap
                    Hotel tmp = listHtl02[j];
                    listHtl02[j] = listHtl02[j-1];
                    listHtl02[j-1] = tmp;
                }
            }
        }
    }

    void bubbleSort(){
        for (int i=0; i<listHtl02.length-1; i++){
            for(int j=1; j<listHtl02.length-i; j++){
                if(listHtl02[j].bintang>listHtl02[j-1].bintang){
                    //proses swap
                    Hotel tmp = listHtl02[j];
                    listHtl02[j] = listHtl02[j-1];
                    listHtl02[j-1] = tmp;
                }
            }
        }
    }

    void selectionSortHarga(){
        for(int i=0; i<listHtl02.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j<listHtl02.length; j++){
                if(listHtl02[j].harga < listHtl02[idxMin].harga){
                    idxMin = j ;
                }
            }

            //swap
            Hotel tmp = listHtl02[idxMin];
            listHtl02[idxMin] =listHtl02[i];
            listHtl02[i] = tmp;
        }
    }

    void selectionSortBintang(){
        for(int i=0; i<listHtl02.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j<listHtl02.length; j++){
                if(listHtl02[j].bintang < listHtl02[idxMin].bintang){
                    idxMin = j ;
                }
            }

            //swap
            Hotel tmp = listHtl02[idxMin];
            listHtl02[idxMin] =listHtl02[i];
            listHtl02[i] = tmp;
        }
    }
}
