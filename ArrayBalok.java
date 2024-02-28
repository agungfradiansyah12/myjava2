package jobsheet3;

public class ArrayBalok {
    public static void main(String[] args) {
        Balok[] blkArray02 = new Balok[3];

        blkArray02[0] = new Balok(100, 30, 12);
        blkArray02[1] = new Balok(120, 40, 15);
        blkArray02[2] = new Balok(210, 50, 25);

        for(int i = 0; i < 3 ; i ++){
            System.out.println("Volume balok ke-" + i + " : " + blkArray02[i].hitungVolume());
        }
    }
}
