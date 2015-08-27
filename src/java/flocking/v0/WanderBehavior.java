package flocking.v0;

public class WanderBehavior extends AbstractBehavior {
    private double direction;
    private double rate;

    public double getDirection() {
        return direction;
    }

    public double getRate() {
        return rate;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
