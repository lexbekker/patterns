package ru.bekker.creational.abstractFactory.ex1.website;

import ru.bekker.creational.abstractFactory.ex1.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes php code...");
    }
}
