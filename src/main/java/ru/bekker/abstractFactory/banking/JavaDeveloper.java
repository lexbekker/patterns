package ru.bekker.abstractFactory.banking;

import ru.bekker.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}
