package CAR;

public class Car implements Drivable {
    String mark;
    String model;
    int year;

    public void setMark(String mark){
        this.mark = mark;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String getMark(){
        return mark;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }


    @Override
    public void start() {
        System.out.println("Машина марки: " + getMark() + " модель : "+ getModel() + " года выпуска " + getYear() + " поехала");
    }

    @Override
    public void stop() {
        System.out.println("Машина марки: " + getMark() + " модель : "+ getModel() + " года выпуска " + getYear() + " остановилась");
    }
    @Override
    public void drive(int distance) {
        System.out.println("Расстояние составило : " + distance );
    }
}
