package CAR;


public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        car.setMark("Merseddes");
        car.setModel("SE");
        car.setYear(2023);

        car.start();
        car.stop();
        car.drive(1204);

    }
}
