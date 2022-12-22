package ru.bekker.creational.abstractFactory.ex1;

public abstract class AbstractProject {
    private final Developer developer;
    private final Tester tester;
    private final ProjectManager projectManager;
    private final ProjectTeamFactory projectTeamFactory;

    public AbstractProject(ProjectTeamFactory projectTeamFactory) {
        this.projectTeamFactory = projectTeamFactory;
        developer = projectTeamFactory.getDeveloper();
        tester = projectTeamFactory.getTester();
        projectManager = projectTeamFactory.getPM();
    }

    public void run() {
        developer.writeCode();
        tester.testProject();
        projectManager.manageProject();
        System.out.println("Project is done!");
    }
}
