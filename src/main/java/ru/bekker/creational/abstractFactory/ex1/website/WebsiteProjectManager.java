package ru.bekker.creational.abstractFactory.ex1.website;

import ru.bekker.creational.abstractFactory.ex1.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website Project manager manages website project...");
    }
}
