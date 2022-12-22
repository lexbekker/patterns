package ru.bekker.creational.abstractFactory.ex1;


import ru.bekker.creational.abstractFactory.ex1.banking.BankingProjectTeamFactory;

public class BankingProject extends AbstractProject {

    public BankingProject() {
        super(new BankingProjectTeamFactory());
    }

    public BankingProject(ProjectTeamFactory projectTeamFactory) {
        super(projectTeamFactory);
    }
}
