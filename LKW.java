package com.company;

/**
 *
 */
public class LKW extends Vehicle {

    /**
     * Default constructor
     */
    public LKW() {
    }

    /**
     *
     */
    private String loads;


    /**
     * @return
     */
    public String getLoads() {
        // TODO implement here
        return loads;
    }

    /**
     * @param newLoads neues Gewicht
     */
    public void setLoads(String newLoads) {
        this.loads = newLoads;
    }

    /**
     * Fiktivwerte / Fiktive Berechnung | Dient zur Demonstration
     * @return Bremsweg in m
     */
    @Override
    public float Bremsweg() {
        return speed / 10 * speed / 10 + 100;
    }

}