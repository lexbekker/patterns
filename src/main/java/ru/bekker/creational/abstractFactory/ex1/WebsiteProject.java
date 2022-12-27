package ru.bekker.creational.abstractFactory.ex1;

import ru.bekker.creational.abstractFactory.ex1.website.WebsiteProjectTeamFactory;

import java.util.List;

public class WebsiteProject extends AbstractProject {

    public WebsiteProject() {
        super(new WebsiteProjectTeamFactory());
    }

    public WebsiteProject(ProjectTeamFactory projectTeamFactory) {
        super(projectTeamFactory);
    }
}
