package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "What is your current age? " );
        int age = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retire = input.nextInt();

        int timeLeft = retire - age;
        System.out.println("You have " + timeLeft + " year until you can retire.");
        System.out.println("It's 2021, so you can retire in " + (2021 + timeLeft));
    }
}
