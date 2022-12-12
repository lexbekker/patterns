package ru.bekker.abstractFactory.banking;

import ru.bekker.abstractFactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
