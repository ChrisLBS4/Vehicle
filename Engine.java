package com.company;

/**
 *
 */
@Deprecated
public class Engine extends Vehicle{


    /**
     * Default constructor
     */
    public Engine() {
    }

    /**
     *
     */
    public boolean sportEngine;



    /**
     * @return
     */
    public boolean getSportEngine() {
        return false;
    }

    /**
     * @param value
     */
    public void setSportEngine(boolean value) {
        // TODO implement here
    }

    boolean IsSportEngine(){
        return Beschleunigung() > 30;
    }
}