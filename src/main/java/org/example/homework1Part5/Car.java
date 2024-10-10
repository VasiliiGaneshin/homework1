package org.example.homework1Part5;

public class Car implements Drivable {
    String brand;
    String model;
    int age;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void carInfo(){
        System.out.println("Car info:");
        System.out.println("brand: " + brand);
        System.out.println("model: " + model);
        System.out.println("age:" + age);
    }

    // Методы для иммитации вождения автомобиля
    @Override
    public void start() {
        System.out.println("The car is moving");
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped");
    }

    @Override
    public void drive(int distance) {
        System.out.println("The distance is: " + distance + " km");
    }
}
