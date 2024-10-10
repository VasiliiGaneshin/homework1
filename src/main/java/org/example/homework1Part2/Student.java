package org.example.homework1Part2;

public class Student implements Printable {
    private String name;
    private int number;
    private int score;

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setNumber(int number) {
        this.number = number;
    }

    //getter
    public int getNumber() {
        return number;
    }

    //setter
    public void setScore(int score) {
        this.score = score;
    }

    //getter
    public int getScore() {
        return score;
    }

    @Override
    public void print() {
        System.out.println("Имя студента: " + name);
        System.out.println("Номер зачетной книжки: " + number);
        System.out.println("Средний балл: " + score);
    }
}
