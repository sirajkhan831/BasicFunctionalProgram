package com.bridgelabz;

import java.util.Scanner;

public class EuclideanDistance {

    public void euclideanDist() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X-coordinate:");
        int x = sc.nextInt();

        Scanner sd = new Scanner(System.in);
        System.out.print("Enter Y coordinate:");
        int y = sd.nextInt();
        double result3 = 0;


        result3 = Math.sqrt((x * x) + (y * y));
        System.out.println(result3);


    }
}
