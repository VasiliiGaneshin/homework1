package org.example.homework1Part4;

public class Clock implements Readable {
    int hours;
    int minutes;
    int seconds;

    public void setHour(int hour) {
        this.hours = hour;
    }

    public int getHour() {
        return hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public int tick(){
        this.seconds += 1;
        return this.seconds;
    }

    public void time(int hours, int minutes, int seconds) {
        System.out.println("Время: " + hours + ":" + minutes + ":" + seconds);
    }

//    public int tick(int seconds) {
//        this.seconds = seconds + 1;
//        return seconds;
//    }



    @Override
    public void readTime() {
        System.out.println("Время: " + hours + " : " + minutes + " : " + seconds);
    }
}
