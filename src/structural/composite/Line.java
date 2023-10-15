package structural.composite;

/**
 * The composite pattern describes
 * a group of objects that are treated
 * the same way as a single instance
 * of the same type of object.
 */
public interface Line {
    void draw(double lengthInPixels);
    void setStartingPosition(Point position);
    Point getStartingPoint();
}
