package ru.bekker.abstractFactory.website;

import ru.bekker.abstractFactory.Developer;
import ru.bekker.abstractFactory.ProjectManager;
import ru.bekker.abstractFactory.ProjectTeamFactory;
import ru.bekker.abstractFactory.Tester;

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
