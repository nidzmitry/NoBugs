package Watches;


public class Main {
    public static void main(String[] args) {
    Clock clock = new Clock();

    clock.setHour((short) 12);
    clock.setMinutes((short) 35);
    clock.setSec((short) 23);

       clock.read();
        System.out.printf("Проходит 11 секунд  \n" );
       clock.tick();
       clock.read();
}
}
