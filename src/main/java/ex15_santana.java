import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
/*
What is the password? 12345
I don't know you.

What is the password? abc$123
Welcome!
 */

public class ex15_santana
{
    public static void main( String[] args ) {
        String password="abc$123";
        System.out.println("What is the password? ");
        Scanner in1 = new Scanner(System.in);
        String inppass = in1.nextLine();

        if (inppass.equals(password))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
