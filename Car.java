package com.company;

/**
 *
 */
public class Car extends Vehicle {

    /**
     * Default constructor
     */
    public Car() {
    }

    /**
     *
     */
    private String brand;

    /**
     *
     */
    public Vehicle is;



    /**
     * @return
     */
    public String getBrand() {
        // TODO implement here
        return "";
    }

    /**
     * @param value
     */
    public void setBrand(String value) {
    }

    /**
     * Fiktivwerte / Fiktive Berechnung | Dient zur Demonstration
     * @return Beschleunigung in m / s
     */
    @Override
    public float Beschleunigung() {

        return speed / 100 + 5;
    }

}