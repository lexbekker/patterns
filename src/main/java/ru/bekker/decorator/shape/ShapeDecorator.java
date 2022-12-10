package ru.bekker.decorator.shape;

/**
 * Абстрактный декоратор, реализующий интерфейс Shape
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
