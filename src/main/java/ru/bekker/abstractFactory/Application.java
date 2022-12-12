package ru.bekker.abstractFactory;


public class Application {
    public static void main(String[] args) {
        AbstractProject project = new BankingProject();
        project.run();
    }
}
