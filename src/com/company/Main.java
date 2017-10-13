package com.company;
/*
 * Jerilyn Mensah
 * October 12, 2017
 *
 * This application will print all values between 1 and 100, printing "Fizz" for multiples of 3,
 * "Buzz" for multiples of 5, and "FizzBuzz" for multiples of 3 and 5.
 *
 * Update- October 13, 2017:
 * The user will now be asked to input a number greater than 1 and count the number up to
 * that number. The program will display the number of multiples of that number, plus
 * multiples of 7, 17 and 23 at the end of the program.
 */

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        int counter = 1;
        int currentValue = 0;
        String FizzBuzz;


        Scanner keyboard = new Scanner(System.in);


            System.out.println("Enter a number greater than 1");
            currentValue = keyboard.nextInt();
            if (currentValue < 1) {
                System.out.println("Invalid Entry. Please enter a number greater than 1");
                currentValue = keyboard.nextInt();
            }

            for (counter = 1; counter <= currentValue; counter++)

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

            }
                // Print the number of multiples of 7, 17, 23 and user input

                System.out.printf( "The number of multiples of 7:   %d \n", +currentValue/7);
                System.out.printf( "The number of multiples of 17:   %d \n", +currentValue/17);
                System.out.printf( "The number of multiples of 23:   %d \n", +currentValue/23);
                System.out.printf( "The number of multiples of user number:   %d \n", +currentValue/currentValue);



        }
    }

//
//                }
//            }
//
//    }
//
//    }
//
//    }
//}

//            {
////            //Print multiples of 7
////            if (counter % 7 == 0) {
////            System.out.println(counter % 7 == 0);
////            }
////            //Print multiples of 17
////            if (counter % 17 == 0) {
////            System.out.println(counter % 17 == 0);
////            }
////            //Print multiples of 23
////            if (counter % 23 == 0) {
////            System.out.println(counter % 23 == 0);
////
////            } //Print multiples of value the user entered
////            if (counter % currentValue == 0) {
////            System.out.println(counter % currentValue == 0);
////            }
////            }