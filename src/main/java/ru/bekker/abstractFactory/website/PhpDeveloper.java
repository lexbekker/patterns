package ru.bekker.abstractFactory.website;

import ru.bekker.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes php code...");
    }
}
