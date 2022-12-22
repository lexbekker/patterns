package ru.bekker.creational.abstractFactory.ex1;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getPM();
}
