package flocking.v3;

public abstract class AbstractBehavior implements Behavior {
    private double strength;

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}