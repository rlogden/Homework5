package edu.dmacc.codedsm.hw5;
import java.lang.Math;
import java.util.Random;

public class MathClass {

    public static void main(String[] args) {

        Random rand = new Random();
        int sr = 27;
        double first = 2.2;
        double second = 4;
        int randomInteger = rand.nextInt(1000);

        System.out.println("The square root of 27 is " + Math.sqrt(sr));
        System.out.println("2.2 to the fourth power is " + Math.pow(first, second));
        System.out.println("Random Integers: "+ randomInteger);
        System.out.println("28 divided by 5 and rounded down is " + 28 / 5);

    }

}
