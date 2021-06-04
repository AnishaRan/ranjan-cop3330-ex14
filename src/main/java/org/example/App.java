package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 14 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        Scanner inString = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderAmt = in.nextDouble();
        System.out.print("What is the state? ");
        String state = inString.nextLine();

        double total = orderAmt;
        if(state.equals("WI")) {
            double tax = 0.055 * orderAmt;
            orderAmt = tax + orderAmt;
            System.out.printf("The subtotal is $%.2f.\nThe tax is $%.2f.\n", total, tax);
        }
            System.out.printf("The total is $%.2f", orderAmt);

    }
}
