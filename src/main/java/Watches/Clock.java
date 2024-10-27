package Watches;

public class Clock implements Readable {
    short hour;
    short minutes;
    short sec;

    public void setHour(short hour){
        this.hour = hour;
    }
    public void setMinutes(short minutes){
        this.minutes = minutes;
    }
    public void  setSec(short sec){
        this.sec = sec;
    }
    public short getHour(){
        return this.hour;
    }
    public short getMinutes(){
        return this.minutes;
    }
    public short getSec(){
        return this.sec;
    }
    public void tick(){
        this.sec += 11;
    }

    @Override
    public void read() {
        System.out.println("Текущее время: " + getHour() +" часов " + getMinutes() + " минут " + getSec() + " секунд.");
    }
}
