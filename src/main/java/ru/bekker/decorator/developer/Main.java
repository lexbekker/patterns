package ru.bekker.decorator.developer;

public class Main extends JavaDeveloper {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());
    }
}
