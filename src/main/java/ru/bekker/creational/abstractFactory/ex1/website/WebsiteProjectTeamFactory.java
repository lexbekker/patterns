package ru.bekker.creational.abstractFactory.ex1.website;

import ru.bekker.creational.abstractFactory.ex1.Developer;
import ru.bekker.creational.abstractFactory.ex1.ProjectManager;
import ru.bekker.creational.abstractFactory.ex1.ProjectTeamFactory;
import ru.bekker.creational.abstractFactory.ex1.Tester;

public class WebsiteProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new WebsiteProjectManager();
    }
}
