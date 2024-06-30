/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projects;
import java.util.Scanner;

public class Projects {
    static Scanner reader = new Scanner(System.in);
static int repate=1;
    public static void main(String[] args) {
        boolean playAgain = true;

        while (playAgain) {
            int randNumber = (int) (Math.random() * 100) + 1;
            boolean flag = true;
            

            while (flag) {
                System.out.println("Please Guess Number Between 1-100 ");
                int guess = reader.nextInt();
                repate++;

                if (guess < 1 || guess > 100) {
                    System.out.println("Please enter a number between 1 and 100");
                } else {
                    if (guess == randNumber) {
                        System.out.println("The Number Is Correct");
                        flag = false; 
                    } else if (guess > randNumber) {
                        System.out.println("The Number is Too High");
                    } else {
                        System.out.println("The Number is Too Small");
                    }
                }

                if (repate >3) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was: " + randNumber);
                    break;
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playChoice = reader.next();

            if (!playChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
                
            }
            else{
            repate=1;
            }
        }

        System.out.println("Thanks for playing!");
    }
}

