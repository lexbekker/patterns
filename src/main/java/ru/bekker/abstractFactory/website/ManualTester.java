package ru.bekker.abstractFactory.website;

import ru.bekker.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testProject() {
        System.out.println("Manual tester testing website project...");
    }
}
