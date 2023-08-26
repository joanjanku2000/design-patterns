package structural.composite;

public class DottedLine implements Line {

    private Point point = new Point(10, 10);

    @Override
    public void draw(final double lengthInPixels) {
        System.out.println("Drawing d.o.t.t.e.d line starting in (" + point.getX() + ", " + point.getY() + ") with length " + lengthInPixels);
    }

    @Override
    public void setStartingPosition(final Point position) {
        this.point = position;
    }

    @Override
    public Point getStartingPoint() {
        return point;
    }
}
