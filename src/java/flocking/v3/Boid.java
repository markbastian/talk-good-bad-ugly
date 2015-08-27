package flocking.v3;

import java.awt.*;
import java.util.Collection;
import java.util.LinkedList;

public class Boid {
    private final Collection<Behavior> behaviors = new LinkedList<>();
    private double positionX;
    private double positionY;
    private double velocityX;
    private double velocityY;
    private double maxSpeed;
    private double height;
    private double width;
    private Color color;
    private Flock flock;

    public Boid() {
    }

    public Flock getFlock() {
        return flock;
    }

    public void setFlock(Flock flock) {
        this.flock = flock;
    }

    public Collection<Behavior> getBehaviors() {
        return behaviors;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void sim(){
        for(Behavior behavior : behaviors){
            //behavior.sim();
        }
    }
}
