package ru.bekker.creational.builder.ex1.builder;

import ru.bekker.creational.builder.ex1.Cms;

public class VisitCardWebsiteBuilder extends AbstractWebsiteBuilder {

    @Override
    public void buildName() {
        website.setName("Visit Card");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    public void buildPrice() {
        website.setPrice(500);
    }
}
