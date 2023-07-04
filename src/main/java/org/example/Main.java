package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* System.out.println("Hello and welcome!");
          System.out.println("Bhuvana");*/
        Scanner operation = new Scanner(System.in);
        System.out.println("Enter the no1");
        int n1 = operation.nextInt();
        System.out.println("Enter the no2");
        int n2 = operation.nextInt();
        /*if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap");
                } else {
                    System.out.println("not leap");
                }
            } else {
                System.out.println("leap");
            }
        } else {
            System.out.println("not leap");
        }*/
        System.out.println(addtion(n1, n2));
        System.out.println(subtraction(n1, n2));
        System.out.println(multiplication(n1, n2));
        System.out.println(division(n1, n2))
    }
        public static int addtion ( int a, int b)
        {
            return a+b;
        }
    public static int subtraction ( int a, int b)
    {
        return a-b;
    }
    public static int multiplication ( int a, int b)
    {
        return a*b;
    }
    public static int division ( int a, int b)
    {
        return a/b;
    }*/

}