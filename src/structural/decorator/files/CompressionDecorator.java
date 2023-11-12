package structural.decorator.files;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource dataSource){
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        System.out.println("Compressing data");
        super.wrappee.writeData(encrypt(data));
    }

    @Override
    public String readData() {
        System.out.println("Decompressing data");
        return super.wrappee.readData();
    }


    private String encrypt(String data){
        return data;
    }
}
