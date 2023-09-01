package behavioral.command;

import java.util.List;

public class FileOperations {
    public static void main(String[] args) {
        final JavaFile javaFile = new JavaFile("Commands.java", "Commands",
                List.of("Command {", " ", "private String content;", "}"));
        final Command changeFileNameCommand = new ChangeFileNameCommand(javaFile, "UpdatedCommands.java");
        final Command removeEmptyLinesCommand = new RemoveEmptyLinesCommand(javaFile);

        System.out.println(javaFile);

        changeFileNameCommand.apply();
        removeEmptyLinesCommand.apply();

        System.out.println(javaFile);

        changeFileNameCommand.cancel();

        System.out.println(javaFile);
    }
}
