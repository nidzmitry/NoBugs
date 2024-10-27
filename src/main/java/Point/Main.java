package Point;

public class Main {
    public static void main(String[] args) {

        Point first = new Point();

        first.setX(1.4);
        first.setY(2.6);
        System.out.println("Изначальные координаты : x = " + first.getX() + "  y = " + first.getY() );

        first.moveUp(3);
        System.out.println("Измениили положение точки по координате \"y + 3\" : " + first.getY() );
        first.moveRight(1);
        System.out.println("Измениили положение точки по координате \"х + 1\" : " + first.getX());
        first.moveDown(1);
        System.out.println("Измениили положение точки по координате \"y - 1\" : " + first.getY());
        first.moveLeft(4);
        System.out.println("Измениили положение точки по координате \"x - 3\" : " + first.getX());


    }
}
