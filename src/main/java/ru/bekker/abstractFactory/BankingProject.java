package ru.bekker.abstractFactory;


import ru.bekker.abstractFactory.banking.BankingProjectTeamFactory;

public class BankingProject extends AbstractProject {

    public BankingProject() {
        super(new BankingProjectTeamFactory());
    }

    public BankingProject(ProjectTeamFactory projectTeamFactory) {
        super(projectTeamFactory);
    }
}
