package Point;

public class Point implements Movable {
     double x;
     double y;

     public double getX(){
         return x;
     }

     public double getY(){
         return y;
     }

     public void setX(double x){
         this.x = x;
     }
     public void  setY(double y){
         this.y = y;
     }


    @Override
    public void moveUp(double y) {
       this.y = this.y + y;
    }

    @Override
    public void moveDown(double y) {
        this.y = this.y - y;
    }

    @Override
    public void moveLeft(double x) {
        this.x = this.x - x;
    }

    @Override
    public void moveRight(double x) {
        this.x = this.x + x;
    }
}
