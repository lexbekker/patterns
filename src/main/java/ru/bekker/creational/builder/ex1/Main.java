package ru.bekker.creational.builder.ex1;

import ru.bekker.creational.builder.ex1.builder.VisitCardWebsiteBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
