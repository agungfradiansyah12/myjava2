package jobsheet2;

public class Dragon {
    int x, y, width, height;

    public Dragon(){

    }

    public Dragon(int x1, int y1, int w, int h){
        x = x1;
        y = y1;
        width = w ;
        height = h;
    }

    void moveLeft(){ //mengurangi x
        if (x>0) 
            x = x-1;
        printPosition();
        detectCollision();
    }

    void moveRight(){
        if (x<width) 
            x = x+1;
        printPosition();
        detectCollision();
    }

    void moveUp(){
        if(y>0)
            y= y-1;
        printPosition();//menampilkan posisi
        detectCollision();
    }

    void moveDown(){
        if (y<height) 
        y = y+1;
        printPosition();
        detectCollision();
    }

    void printPosition(){
        System.out.printf("(%d, %d)\n", x,y);
    }

    void detectCollision(){
        if (x<=0 || y<=0 || x>= width || y >=height) {
            System.out.println("Game Over");
        }
    }

    public static void main(String[] args) {
        Dragon d = new Dragon(7,19,24,12);
        d.printPosition();
        d.moveRight();d.moveLeft();
    }
}
