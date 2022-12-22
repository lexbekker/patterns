package ru.bekker.creational.abstractFactory.ex1.banking;

import ru.bekker.creational.abstractFactory.ex1.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}
