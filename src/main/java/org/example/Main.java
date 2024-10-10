package org.example;

import org.example.Book.Book;
import org.example.Student.Student;
import org.example.Point.Point;
import org.example.Clock.Clock;
import org.example.Car.Car;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        sum();
        sub();
        div();
        mult();
    }

    public static void sum() {
        int sum = 5 + 1;
        System.out.println(sum);
    }

    public static void sub() {
        int sub = 6 - 2;
        System.out.println(sub);
    }

    public static void div() {
        int div = 9 / 3;
        System.out.println(div);
    }

    public static void mult() {
        int mult = 4 * 4;
        System.out.println(mult);


    System.out.println();
    System.out.println("-------------Book-------------");
    Book book1 = new Book();
    book1.setName("Перевал");
    book1.setAuthor("Кир Булычев");
    book1.setYear(2000);
    book1.display();

    System.out.println();
    System.out.println("-------------Student-------------");
    Student student1 = new Student();
    student1.setName("Vasilii");
    student1.setNumber(777);
    student1.setScore(4);
    student1.print();

    System.out.println();
    System.out.println("-------------Point-------------");
    Point point = new Point();
    point.setX(7);
    point.setY(13);
    point.moveUp();
    point.moveRight();
    point.point();

    System.out.println();
    System.out.println("-------------Clock-------------");
    Clock clock1 = new Clock();
    clock1.setHour(15);
    clock1.setMinutes(10);
    clock1.setSeconds(8);
    clock1.readTime();
    clock1.tick();
    clock1.readTime();

    System.out.println();
    System.out.println("-------------Car-------------");
    Car car1 = new Car();
    car1.setBrand("Kia");
    car1.setModel("Seltos");
    car1.setAge(2021);
    car1.carInfo();
    car1.start();
    car1.stop();
    car1.drive(56);
    }
}