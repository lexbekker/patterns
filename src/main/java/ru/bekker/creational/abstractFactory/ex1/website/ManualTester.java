package ru.bekker.creational.abstractFactory.ex1.website;

import ru.bekker.creational.abstractFactory.ex1.Tester;

public class ManualTester implements Tester {
    @Override
    public void testProject() {
        System.out.println("Manual tester testing website project...");
    }
}
