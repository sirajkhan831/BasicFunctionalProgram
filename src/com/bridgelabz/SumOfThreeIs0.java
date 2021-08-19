package com.bridgelabz;

import java.util.Scanner;

public class SumOfThreeIs0 {

    public void sumOfThree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int m = sc.nextInt();
        int count = 0;


        int[] Array = new int[m];

        for (int i = 0; i < m; i++) {

            Scanner ij = new Scanner(System.in);
            System.out.print("Enter element ");
            int mn = ij.nextInt();
            Array[i] = mn;


        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    if (Array[i] + Array[j] + Array[k] == 0) {
                        count++;
                        System.out.println(Array[i] + " , " + Array[j] + " , " + Array[k] + " are triplets.");

                    }
                }
            }
        }
        System.out.println("Number of triplets present = " + count);
    }
}