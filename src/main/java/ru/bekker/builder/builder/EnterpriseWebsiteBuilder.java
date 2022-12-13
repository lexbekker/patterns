package ru.bekker.builder.builder;

import ru.bekker.builder.Cms;

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
