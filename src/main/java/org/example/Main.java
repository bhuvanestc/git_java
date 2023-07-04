package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello and welcome!");//
        //  System.out.println("Bhuvana");//
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = get.nextInt();
        if (year % 4 == 0) {
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
        }
    }



    }