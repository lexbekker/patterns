package ru.bekker.decorator.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Я прямоугольник!");
    }
}
