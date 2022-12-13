package ru.bekker.builder;

import ru.bekker.builder.builder.AbstractWebsiteBuilder;

public class Director {
    private AbstractWebsiteBuilder builder;

    void setBuilder(AbstractWebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

        return builder.getWebsite();
    }
}
