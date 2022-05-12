/**
 * @author Christoph.TASTLER
 * @version 0.1
 * Testklasse
 */
package com.company;

import java.lang.annotation.Documented;
import java.util.Scanner;

/**
 * Main
 */
@Documented @interface CustomAnnotation {String value();}
@CustomAnnotation("test")
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {


        @SuppressWarnings("unused")
        Scanner input = new Scanner( System.in );


        Car CarOne = new Car();
        LKW LKWOne = new LKW();

        CarOne.setSpeed(200);
        CarOne.setWeight(1000);

        LKWOne.setSpeed(130);
        LKWOne.setWeight(3000);

        String temp = "stones";
        LKWOne.setLoads(temp);

        CarOne.Beschleunigung();
        CarOne.Bremsweg();

        LKWOne.Beschleunigung();
        LKWOne.Bremsweg();
        LKWOne.getLoads();

        System.out.println(CarOne.Beschleunigung());
        System.out.println(CarOne.Bremsweg());
        System.out.println(LKWOne.Beschleunigung());
        System.out.println(LKWOne.getLoads());
    }
}
