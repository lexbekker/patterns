package ru.bekker.builder.builder;

import ru.bekker.builder.Cms;

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
