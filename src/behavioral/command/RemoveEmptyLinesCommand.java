package behavioral.command;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveEmptyLinesCommand implements Command {

    private final JavaFile javaFile;

    public RemoveEmptyLinesCommand(final JavaFile javaFile) {
        this.javaFile = javaFile;
    }

    @Override
    public void apply() {
        final List<String> nonEmptyLines = javaFile.getLinesContent().stream()
                .filter(line -> !line.trim().isEmpty())
                .collect(Collectors.toList());
        javaFile.setLinesContent(nonEmptyLines);
    }

    @Override
    public void cancel() {
        throw new UnsupportedOperationException("Cancelling this operation is not possible ATM");
    }
}
