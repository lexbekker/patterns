package ru.bekker.abstractFactory.banking;

import ru.bekker.abstractFactory.Developer;
import ru.bekker.abstractFactory.ProjectManager;
import ru.bekker.abstractFactory.ProjectTeamFactory;
import ru.bekker.abstractFactory.Tester;

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
