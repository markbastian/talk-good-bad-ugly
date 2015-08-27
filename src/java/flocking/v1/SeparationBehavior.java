package flocking.v1;

public class SeparationBehavior extends AbstractFlockBehavior {
    private double range;

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }
}
