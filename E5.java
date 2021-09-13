/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.Scanner;

public class E5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = 0;
        int num1 = 0;

        System.out.println("What is the first number? ");
        num = scan.nextInt();

        System.out.println("What is the second number? ");
        num1 = scan.nextInt();

        System.out.println(num + " + " + num1 + " = " + (num+num1));
        System.out.println(num + " - " + num1 + " = " + (num-num1));
        System.out.println(num + " * " + num1 + " = " + (num*num1));
        System.out.println(num + " / " + num1 + " = " + (num/num1));
    }

}
