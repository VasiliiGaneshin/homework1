package org.example.homework1Part3;

public class Point implements Movable {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void point(){
        System.out.println("Координаты точки: " + "x: " + x + " ," + " y: " + y);
    }

    @Override
    public void moveUp() {
        y += 1;
    }

    @Override
    public void moveDown() {
        y -= 1;
    }

    @Override
    public void moveRight() {
        x += 1;
    }

    @Override
    public void moveLeft() {
        x -= 1;
    }
}
