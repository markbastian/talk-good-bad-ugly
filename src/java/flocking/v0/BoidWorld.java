package flocking.v0;

public class BoidWorld {
    private double minX;
    private double maxX;
    private double minY;
    private double maxY;
    private Flock flock;

    public BoidWorld(double minX, double maxX, double minY, double maxY, Flock flock) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.flock = flock;
    }

    public double getMinX() {
        return minX;
    }

    public double getMaxX() {
        return maxX;
    }

    public double getMinY() {
        return minY;
    }

    public double getMaxY() {
        return maxY;
    }

    public Flock getFlock() {
        return flock;
    }
}
