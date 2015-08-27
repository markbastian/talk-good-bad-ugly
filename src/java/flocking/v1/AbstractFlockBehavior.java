package flocking.v1;

public abstract class AbstractFlockBehavior extends AbstractBehavior implements FlockBehavior {
    private Flock flock;

    public Flock getFlock() {
        return flock;
    }

    public void setFlock(Flock flock) {
        this.flock = flock;
    }
}
