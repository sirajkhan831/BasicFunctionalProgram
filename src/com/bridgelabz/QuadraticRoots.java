package com.bridgelabz;

import java.util.Scanner;

public class QuadraticRoots {

    public void quadraticRoots() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        Scanner sd = new Scanner(System.in);
        System.out.print("Enter b: ");
        int b = sd.nextInt();

        Scanner se = new Scanner(System.in);
        System.out.print("Enter c: ");
        int c = se.nextInt();

        double delta = (b * b) - (4 * a * c);
        delta = Math.sqrt(delta);

        double root1 = (-b + delta / (2 * a));

        double root2 = (-b - delta / (2 * a));
        System.out.println("roots are");
        System.out.println(root1);
        System.out.println(root2);
    }
}

