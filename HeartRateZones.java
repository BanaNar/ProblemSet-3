/***********************************************
 * @ file HeartRateZones.java
 * @ brief This program can calculate users' target heart rate zone after users chose their training target.
 * @ author Jianqiu Xu (Tony)
 * @ date September 18, 2017
 ***********************************************/
import java.util.Scanner;

public class HeartRateZones {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        int age;
        int hr;
        int maxhr;
        int choice;
        double d;
        double lowend;
        double highend;

        System.out.println("Target Heart Rate Zone Calculator ======================================");
        System.out.println();
        System.out.print("Enter your age: ");
        age = scnr.nextInt();
        System.out.print("Enter your resting heart rate: ");
        hr = scnr.nextInt();
        System.out.println();
        System.out.println("Choose your target:");
        System.out.println("1. Weight loss or build endurance");
        System.out.println("2. Weight management or improve cardio fitness");
        System.out.println("3. Interval workout");
        System.out.println();
        System.out.print("Your choice: ");
        choice = scnr.nextInt();


        if (choice <= 0 || choice >= 4){    //Can also use if(!(choice >= 1 && choice <= 3))

            System.out.println("You have entered a wrong value, please enter 1 or 2 or 3.");
            return;

        }   //now we only have choice 1, 2, 3
        if (choice == 1){

            maxhr = 220 - age;
            d = maxhr - hr;
            lowend = d * 0.60 + hr;
            highend = d * 0.70 + hr;

            System.out.println();
            System.out.printf("Your target heart rate zone is %.2f - %.2f", lowend, highend);

        }
        else if (choice == 2){

            maxhr = 220 - age;
            d = maxhr - hr;
            lowend = d * 0.70 + hr;
            highend = d * 0.80 + hr;

            System.out.println();
            System.out.printf("Your target heart rate zone is %.2f - %.2f", lowend, highend);

        }
        else if (choice == 3){

            maxhr = 220 - age;
            d = maxhr - hr;
            lowend = d * 0.80 + hr;

            System.out.println();
            System.out.printf("Your target heart rate zone should be over %.2f", lowend);

        }

        return;

    }
}
