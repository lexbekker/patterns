package ru.bekker.abstractFactory.website;

import ru.bekker.abstractFactory.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website Project manager manages website project...");
    }
}
