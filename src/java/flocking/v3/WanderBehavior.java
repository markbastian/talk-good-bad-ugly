package flocking.v3;

public class WanderBehavior extends IndividualBehavior {
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
