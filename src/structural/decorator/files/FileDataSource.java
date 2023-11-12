package structural.decorator.files;

public class FileDataSource implements DataSource {
    private final String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        System.out.println("Writing " + data + " in " + fileName);
    }

    @Override
    public String readData() {
        System.out.println("Reading data in " + fileName);
        return null;
    }

    public String getFileName() {
        return this.fileName;
    }
}
