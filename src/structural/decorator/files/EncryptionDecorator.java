package structural.decorator.files;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource wrappe) {
        super(wrappe);
    }
    @Override
    public void writeData(String data) {
        System.out.println("Encrypting data " +
                data + " before writing to "
                + super.wrappee);
    }

    @Override
    public String readData() {
        System.out.println("Reading encrypted data");
        return null;
    }
}
