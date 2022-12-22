package ru.bekker.decorator.base;

import javax.xml.crypto.Data;

public class DataSourceDecorator implements DataSource {
    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData() {
        dataSource.writeData();
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
