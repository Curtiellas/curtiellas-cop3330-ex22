package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        String[] names = {"first", "second", "third"};
        double[] numbers = new double[3];

        for (int a = 0; a < numbers.length; a++)
        {
            System.out.print("Enter the " + names[a] + " number: ");
            numbers[a] = sc.nextDouble();
        }

        if (numbers[0] == numbers[1] || numbers[0] == numbers[2] || numbers[1] == numbers[2])
            System.exit(0);

        double largest = numbers[0];

        for (int a = 1; a < numbers.length; a++)
            if (numbers[a] > largest)
                largest = numbers[a];

        System.out.println( "The largest number is " + largest );
    }
}
