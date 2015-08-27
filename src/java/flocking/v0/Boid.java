package flocking.v0;

import java.awt.*;

public class Boid {
    private double positionX;
    private double positionY;
    private double velocityX;
    private double velocityY;
    private double maxSpeed;
    private double height;
    private double width;
    private Color color;
    private final WanderBehavior wanderBehavior = new WanderBehavior();
    private final AlignmentBehavior alignmentBehavior = new AlignmentBehavior();
    private final CohesionBehavior cohesionBehavior = new CohesionBehavior();
    private final SeparationBehavior separationBehavior = new SeparationBehavior();

    public Boid() {
    }

    public WanderBehavior getWanderBehavior() {
        return wanderBehavior;
    }

    public AlignmentBehavior getAlignmentBehavior() {
        return alignmentBehavior;
    }

    public CohesionBehavior getCohesionBehavior() {
        return cohesionBehavior;
    }

    public SeparationBehavior getSeparationBehavior() {
        return separationBehavior;
    }

    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
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
}
