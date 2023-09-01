package behavioral.command;


import java.util.ArrayList;
import java.util.List;

public class JavaFile {
    private String fileName;
    private String className;
    private List<String> linesContent = new ArrayList<>();

    public JavaFile(String fileName, String className, List<String> linesContent) {
        this.fileName = fileName;
        this.className = className;
        this.linesContent = linesContent;
    }

    public void addLine(final String line) {
        linesContent.add(line);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<String> getLinesContent() {
        return linesContent;
    }

    public void setLinesContent(List<String> linesContent) {
        this.linesContent = linesContent;
    }

    @Override
    public String toString() {
        return "JavaFile{" +
                "fileName='" + fileName + '\'' +
                ", className='" + className + '\'' +
                ", linesContent=" + String.join("\n", linesContent) +
                '}';
    }
}
