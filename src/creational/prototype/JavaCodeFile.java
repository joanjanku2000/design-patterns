package creational.prototype;

public class JavaCodeFile implements Cloneable {
    private String licenseContent;
    private String code;
    private String fileName;
    private String fileExtension;

    public JavaCodeFile(final String licenseContent, final String fileExtension) {
        this.licenseContent = licenseContent;
        this.fileExtension = fileExtension;
    }

    public JavaCodeFile(final String licenseContent, final String code, final String fileName, final String fileExtension) {
        this.licenseContent = licenseContent;
        this.code = code;
        this.fileName = fileName;
        this.fileExtension = fileExtension;
    }

    public String getLicenseContent() {
        return licenseContent;
    }

    public void setLicenseContent(final String licenseContent) {
        this.licenseContent = licenseContent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(final String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public JavaCodeFile createClone() throws CloneNotSupportedException {
        return (JavaCodeFile)clone();
    }

    @Override
    public String toString() {
        return "JavaCodeFile{" +
                "licenseContent='" + licenseContent + '\'' +
                ", code='" + code + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileExtension='" + fileExtension + '\'' +
                '}';
    }
}
