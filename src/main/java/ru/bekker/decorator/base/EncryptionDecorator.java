package ru.bekker.decorator.base;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData() {
        System.out.println("Шифруем данные");
        this.dataSource.writeData();
    }

    @Override
    public String readData() {
        System.out.println("Читаем данные");
        return super.readData();
    }
}
