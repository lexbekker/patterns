package ru.bekker.decorator.shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Я круг!");
    }
}
