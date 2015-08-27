package flocking.v3;

import java.util.Collection;
import java.util.LinkedList;

public class Flock {
    private final Collection<Boid> boids = new LinkedList<>();

    public void sim(){
        for(Boid boid : boids){
            boid.sim();
        }
    }
}
