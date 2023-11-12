package structural.decorator.files;

public class DecoratorUsage {

    public static void main(String[] args) {
        DataSource dataSource = new FileDataSource("C://joan//user.sql");
        DataSource compressionDecorator = new CompressionDecorator(
                new EncryptionDecorator(dataSource)
        );
        compressionDecorator.writeData("test");
    }
}
