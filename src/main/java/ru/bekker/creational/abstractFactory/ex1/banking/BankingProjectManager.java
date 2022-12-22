package ru.bekker.creational.abstractFactory.ex1.banking;

import ru.bekker.creational.abstractFactory.ex1.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
