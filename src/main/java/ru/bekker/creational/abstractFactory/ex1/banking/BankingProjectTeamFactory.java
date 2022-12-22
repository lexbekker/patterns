package ru.bekker.creational.abstractFactory.ex1.banking;

import ru.bekker.creational.abstractFactory.ex1.Developer;
import ru.bekker.creational.abstractFactory.ex1.ProjectManager;
import ru.bekker.creational.abstractFactory.ex1.ProjectTeamFactory;
import ru.bekker.creational.abstractFactory.ex1.Tester;

public class BankingProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankingProjectManager();
    }
}
