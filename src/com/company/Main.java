package com.company;
/*
 * Jerilyn Mensah
 * October 12, 2017
 *
 * This application will print all values between 1 and 100, printing "Fizz" for multiples of 3,
 * "Buzz" for multiples of 5, and "FizzBuzz" for multiples of 3 and 5.
 *
 * Update- October 13, 2017:
 * The user will now be asked to input a number greater than 1 and the program will display multiples
 * of that number, plus multiples of 7, 17 and 23 at the end of the program.
 */

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int counter = 1;
        int currentValue = 0;
        String answer;
        String FizzBuzz;

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Enter a number greater than 1");
            currentValue = keyboard.nextInt();
            if(currentValue < 1)
            {
                System.out.println("Invalid Entry. Please enter a number greater than 1");
                currentValue = keyboard.nextInt();
            }

            for (counter =1; counter <= currentValue; counter++)

            {
                FizzBuzz = "";

                //Print "Fizz" for multiples of 3
                if (counter % 3 == 0) {
                    FizzBuzz += "Fizz";
                }

                // Print "Buzz for multiples of 5
                if (counter % 5 == 0) {
                    FizzBuzz += "Buzz";
                }

                //Convert to string value when displayed
                if (counter % 3 != 0 && counter % 5 != 0) {
                    FizzBuzz = Integer.toString(counter);
                }
                System.out.println(FizzBuzz);

            }while(currentValue > 1);{
        }
    }while(counter != currentValue);
        {

                //Print multiples of 7
            if (counter % 7 == 0)
            {
                System.out.println(counter%7 == 0);
            }
                //Print multiples of 17
            if (counter % 17 == 0)
            {
                System.out.println(counter%17 == 0);
            }
                //Print multiples of 23
            if (counter % 23 == 0)
            {
                System.out.println(counter%23 == 0);

            } //Print multiples of value the user entered
            if (counter % currentValue == 0)
            {
                System.out.println(counter%currentValue == 0);
            }

        }System.out.print(counter!=currentValue);
    }
    }

