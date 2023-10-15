package creational.prototype;

/**
 * Prototype design pattern is used when the Object creation is a
 * costly affair and requires a lot of time and resources and
 * you have a similar object already existing. Prototype pattern provides
 * a mechanism to copy the original object to a new object
 * and then modify it according to our needs
 */
public class SimplePrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        final JavaCodeFilesManager javaCodeFilesManager = new JavaCodeFilesManager();
        JavaCodeFile fileA = javaCodeFilesManager.createFileWithContent("Integers", "int x = 3;");
        JavaCodeFile fileB = javaCodeFilesManager.createFileWithContent("Strings", "String y = \"3\";");

        System.out.println(fileA);
        System.out.println(fileB);
    }
}