/***********************************************
 * @ file PredictGPA.java
 * @ brief This program can help students to predict their semester GPA.
 * @ author Jianqiu Xu (Tony)
 * @ date September 18, 2017
 ***********************************************/
import java.util.Scanner;

public class PredictGPA {
    public static void main(String[] args){

        Scanner scnr = new Scanner(System.in);
        double hr1, hr2, hr3, hr4;
        String gr1, gr2, gr3, gr4;
        double numgr1 = 0;
        double numgr2 = 0;
        double numgr3 = 0;
        double numgr4 = 0;
        double gpa = 0;
        double totalhrs = 0;

        System.out.println("Semester GPA Predictor =================================================");
        System.out.println("Let's see what your potential GPA could be this semester!");
        System.out.println();

        System.out.print("Course 1: Number of hours?: ");
        hr1 = scnr.nextDouble();
        System.out.print("Course 1: Expected grade?: ");
        gr1 = scnr.next();  //convert grade into a number grade
        if (gr1.equals("A")){
            numgr1 = 4.0;
        }
        else if (gr1.equals("A-")){
            numgr1 = 3.67;
        }
        else if (gr1.equals("B+")){
            numgr1 = 3.33;
        }
        else if (gr1.equals("B")){
            numgr1 = 3.0;
        }
        else if (gr1.equals("B-")){
            numgr1 = 2.67;
        }
        else if (gr1.equals("C+")){
            numgr1 = 2.33;
        }
        else if (gr1.equals("C")){
            numgr1 = 2.0;
        }
        else if (gr1.equals("C-")){
            numgr1 = 1.67;
        }
        else if (gr1.equals("D+")){
            numgr1 = 1.33;
        }
        else if (gr1.equals("D")){
            numgr1 = 1.0;
        }
        else if (gr1.equals("F")){
            numgr1 = 0.0;
        }
        gpa = gpa + hr1 * numgr1;
        totalhrs = totalhrs + hr1;
        System.out.println();

        System.out.print("Course 2: Number of hours?: ");
        hr2 = scnr.nextDouble();
        System.out.print("Course 2: Expected grade?: ");
        gr2 = scnr.next();  //convert grade into a number grade
        if (gr2.equals("A")){
            numgr2 = 4.0;
        }
        else if (gr2.equals("A-")){
            numgr2 = 3.67;
        }
        else if (gr2.equals("B+")){
            numgr2 = 3.33;
        }
        else if (gr2.equals("B")){
            numgr2 = 3.0;
        }
        else if (gr2.equals("B-")){
            numgr2 = 2.67;
        }
        else if (gr2.equals("C+")){
            numgr2 = 2.33;
        }
        else if (gr2.equals("C")){
            numgr2 = 2.0;
        }
        else if (gr2.equals("C-")){
            numgr2 = 1.67;
        }
        else if (gr2.equals("D+")){
            numgr2 = 1.33;
        }
        else if (gr2.equals("D")){
            numgr2 = 1.0;
        }
        else if (gr2.equals("F")){
            numgr2 = 0.0;
        }
        gpa = gpa + hr2 * numgr2;
        totalhrs = totalhrs + hr2;
        System.out.println();

        System.out.print("Course 3: Number of hours?: ");
        hr3 = scnr.nextDouble();
        System.out.print("Course 3: Expected grade?: ");
        gr3 = scnr.next();  //convert grade into a number grade
        if (gr3.equals("A")){
            numgr3 = 4.0;
        }
        else if (gr3.equals("A-")){
            numgr3 = 3.67;
        }
        else if (gr3.equals("B+")){
            numgr3 = 3.33;
        }
        else if (gr3.equals("B")){
            numgr3 = 3.0;
        }
        else if (gr3.equals("B-")){
            numgr3 = 2.67;
        }
        else if (gr3.equals("C+")){
            numgr3 = 2.33;
        }
        else if (gr3.equals("C")){
            numgr3 = 2.0;
        }
        else if (gr3.equals("C-")){
            numgr3 = 1.67;
        }
        else if (gr3.equals("D+")){
            numgr3 = 1.33;
        }
        else if (gr3.equals("D")){
            numgr3 = 1.0;
        }
        else if (gr3.equals("F")){
            numgr3 = 0.0;
        }
        gpa = gpa + hr1 * numgr3;
        totalhrs = totalhrs + hr3;
        System.out.println();

        System.out.print("Course 4: Number of hours?: ");
        hr4 = scnr.nextDouble();
        System.out.print("Course 4: Expected grade?: ");
        gr4 = scnr.next();  //convert grade into a number grade
        if (gr4.equals("A")){
            numgr4 = 4.0;
        }
        else if (gr4.equals("A-")){
            numgr4 = 3.67;
        }
        else if (gr4.equals("B+")){
            numgr4 = 3.33;
        }
        else if (gr4.equals("B")){
            numgr4 = 3.0;
        }
        else if (gr4.equals("B-")){
            numgr4 = 2.67;
        }
        else if (gr4.equals("C+")){
            numgr4 = 2.33;
        }
        else if (gr4.equals("C")){
            numgr4 = 2.0;
        }
        else if (gr4.equals("C-")){
            numgr4 = 1.67;
        }
        else if (gr4.equals("D+")){
            numgr4 = 1.33;
        }
        else if (gr4.equals("D")){
            numgr4 = 1.0;
        }
        else if (gr4.equals("F")){
            numgr4 = 0.0;
        }
        gpa = gpa + hr4 * numgr4;
        totalhrs = totalhrs + hr4;
        System.out.println();

        gpa = gpa / totalhrs;

        System.out.printf("Your semester GPA would be: %.4f", gpa);

    }
}
