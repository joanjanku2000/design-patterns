package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ChangeFileNameCommand implements Command {

    private final JavaFile javaFile;
    private final String newName;
    private String previousName = null;


    public ChangeFileNameCommand(final JavaFile javaFile, final String newName) {
        this.javaFile = javaFile;
        this.newName = newName;
    }

    @Override
    public void apply() {
        if (javaFile.getFileName().equals(newName)) {
            System.out.println("Cannot change file name to same one");
        } else {
            previousName = javaFile.getFileName();
            javaFile.setFileName(newName);
            javaFile.setClassName(newName.substring(0, newName.length() - 5)); // lack of validation! + simplified solution - we dont change classname in lines field
            System.out.println("File name changed to " + newName);
        }
    }

    @Override
    public void cancel() {
        if (previousName == null) {
            System.out.println("Cannot cancel command");
        } else {
            javaFile.setFileName(previousName);
            javaFile.setClassName(previousName);
            previousName = null;
        }
    }
}
