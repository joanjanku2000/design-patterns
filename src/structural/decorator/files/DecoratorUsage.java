package structural.decorator.files;

public class DecoratorUsage {

    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("C://joan//user.sql");
//        DataSource encryptionDecorator
//                = new EncryptionDecorator(dataSource);
//        encryptionDecorator.writeData("test");

        DataSource compressionDecorator = new CompressionDecorator(dataSource);
        compressionDecorator.writeData("test");
    }
}
