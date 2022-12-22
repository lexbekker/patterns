package ru.bekker.decorator.base;

public class FileDataSource implements DataSource {
    private String data;

    public FileDataSource(String data) {
        this.data = data;
    }

    @Override
    public void writeData() {
        System.out.println(data);;
    }

    @Override
    public String readData() {
        return data;
    }
}
