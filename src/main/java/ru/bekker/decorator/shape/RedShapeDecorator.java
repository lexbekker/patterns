package ru.bekker.decorator.shape;

/**
 * Конкретный класс-декоратор, наследующийся от абстрактного класса
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Сообщение от RedShapeDecorator. Цвет границы: красный");
    }
}
