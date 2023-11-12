package structural.decorator.files;

public interface DataSource {
    void writeData(String data);
    String readData();
}
