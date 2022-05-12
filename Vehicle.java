package com.company;

/**
 *
 */
public abstract class  Vehicle {
    /**
     * Main-Klasse
     */

    /**
     * Sitze
     */
    protected int seats;

    /**
     * Farbe
     */
    protected String colour;

    /**
     * Gewicht
     */
    protected float weight;

    /**
     *
     */
    protected float speed;


    /**
     * @return
     */
    public int getSeats() {
        // TODO implement here
        return 0;
    }

    /**
     * @param value
     */
    public void setSeats(int value) {
        // TODO implement here
    }

    /**
     * @return Farbe
     */
    public String getColour() {
        // TODO implement here
        return colour;
    }

    /**
     * @param newColour Farbe
     */
    public void setColour(String newColour) {
        // TODO implement here
    }

    /**
     * @return Geschwindigkeit
     */
    public float getSpeed() {
        // TODO implement here
        return speed;
    }

    /**
     * @param newSpeed Neue Geschwindigkeit
     */
    public void setSpeed(float newSpeed) {
        this.speed = newSpeed;
    }

    /**
     * @return Gewicht
     */
    public float getWeight() {
        // TODO implement here
        return weight;
    }

    /**
     * @param newWeight Neues Gewicht
     */
    public void setWeight(float newWeight) {
        this.weight = newWeight;
    }

    /** Fiktivwerte / Fiktive Berechnung | Dient zur Demonstration
     * @return Beschleunigung in m/s
     */
    public float Beschleunigung() {
        return speed / 100;
    }

    /** Fiktivwerte / Fiktive Berechnung | Dient zur Demonstration
     * @return Bremsweg in Meter
     */
    public float Bremsweg() {
        return speed / 10 * speed / 10;
    }

    /**
     *
     */
    public int Gang() {
        // TODO implement here
        return 0;
    }

}