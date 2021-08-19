package com.bridgelabz;

import java.util.Scanner;

public class BasicFunctionalPrograms {

    public static void main(String[] args) {
        System.out.println("Enter your option for choice of program : 1.2D Array 2.Sum of 3 is zero 3.Euclidean Distance 4.Quadratic Roots 5.Wind Chill");
        Scanner optionScan = new Scanner(System.in);
        int option = optionScan.nextInt();

        switch (option) {
            case 1 -> {
                TwoDArray twoDArray = new TwoDArray();
                twoDArray.Array();
            }
            case 2 -> {
                SumOfThreeIs0 sumOfThreeIs0 = new SumOfThreeIs0();
                sumOfThreeIs0.sumOfThree();
            }
            case 3 -> {
                EuclideanDistance euclideanDistance = new EuclideanDistance();
                euclideanDistance.euclideanDist();
            }
            case 4 -> {
                QuadraticRoots quadraticRoots = new QuadraticRoots();
                quadraticRoots.quadraticRoots();
            }
            case 5 -> {
                WindChill windChill = new WindChill();
                windChill.windChill();
            }
            default -> System.out.println("Please choose correct option.");
        }
    }

}
