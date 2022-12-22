package ru.bekker.creational.abstractFactory.ex1;


public class Application {
    public static void main(String[] args) {
        AbstractProject project = new BankingProject();
        project.run();
    }
}
