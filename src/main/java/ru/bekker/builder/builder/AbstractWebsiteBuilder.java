package ru.bekker.builder.builder;

import ru.bekker.builder.Website;

public abstract class AbstractWebsiteBuilder {
    protected Website website;

    public void createWebsite() {
        website = new Website();
    }

    public abstract void buildName();
    public abstract void buildCms();
    public abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
