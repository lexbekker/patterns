package ru.bekker.decorator.shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Я треугольник!");
    }
}
