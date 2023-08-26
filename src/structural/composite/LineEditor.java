package structural.composite;

import java.util.List;

public abstract class LineEditor {

    private final CompoundLine compoundLine = new CompoundLine();

    public void selectAndRemove(final List<Line> lines) {
        lines.forEach(compoundLine::removeLine);
    }

    public void createLine(final String type) {
        if (type.equals("dotted")) {
            compoundLine.addLine(new DottedLine());
        } else {
            compoundLine.addLine(new SolidLine());
        }
    }

    public void drawShortAllAtPoint(final Point point) {
        compoundLine.setStartingPosition(point);
        compoundLine.draw(5.0);
    }
}
