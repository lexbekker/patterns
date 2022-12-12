package ru.bekker.abstractFactory;

import ru.bekker.abstractFactory.website.WebsiteProjectTeamFactory;

public class WebsiteProject extends AbstractProject {

    public WebsiteProject() {
        super(new WebsiteProjectTeamFactory());
    }

    public WebsiteProject(ProjectTeamFactory projectTeamFactory) {
        super(projectTeamFactory);
    }
}
