/***********************************************
 * @ file CreativeExercise.java
 * @ brief This program counts all the numbers that are divisible by 7 with in a given range.
 * @ author Jianqiu Xu (Tony)
 * @ date September 21, 2017
 ***********************************************/
import java.util.Scanner;

public class CreativeExercise {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = 1;
        int sum = 0;
        int max = 0;
        int c = 0;
        int total = 0;

        System.out.println("This program counts all the numbers that are divisible by 7 with in a given range.");
        System.out.println();
        System.out.print("Range from 0 to ? (Please type a positive integer): ");
        max = scnr.nextInt();

        System.out.println();
        System.out.println("Do you want to know the sum of these numbers?");
        System.out.println("1. I want to know");
        System.out.println("2. I don't care");
        System.out.print("1 or 2: ");
        c = scnr.nextInt();
        System.out.println();

        while (max > number) {

            if (number % 7 == 0) {

                total++;
                number++;

            }
            else if (number % 7 != 0){

                number++;

            }

        }

        if (c == 1) {

            sum = (1 + max) * (max - 0) / 2;

            System.out.println("There are " + total + " numbers are divisible by 7 within 0 to " + max);
            System.out.println("The sum of them is " + sum);
            return;

        }
        else if (c == 2){

            System.out.println("There are " + total + " numbers are divisible by 7 within 0 to " + max);
            return;

        }
    }
}

