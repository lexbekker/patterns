package ru.bekker.creational.builder.ex1.builder;

import ru.bekker.creational.builder.ex1.Cms;

public class EnterpriseWebsiteBuilder extends AbstractWebsiteBuilder {

    @Override
    public void buildName() {
        website.setName("Enterprize site");
    }

    @Override
    public void buildCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    public void buildPrice() {
        website.setPrice(1000);
    }
}
