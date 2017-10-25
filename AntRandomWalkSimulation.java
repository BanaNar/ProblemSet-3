/***********************************************
 * @ file AntRandomWalkSimulation.java
 * @ brief This program simulates how a single ant may walk randomly through a given area.
 * @ author Jianqiu Xu (Tony)
 * @ date September 19, 2017
 ***********************************************/
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class AntRandomWalkSimulation {
    public static void main(String[] args) {

        int i = 0;

        StdDraw.setPenColor(Color.orange);
        StdDraw.setScale(-1, 21);
        while(i <= 20){

            StdDraw.line(i, 0, i, 20);
            i++;

        }

        i = 0;
        while(i <= 20){

            StdDraw.line(0, i, 20, i);
            i++;

        }

        Scanner scnr = new Scanner(System.in);
        int counter = 0;
        int step = 0;
        int v1, v2;

        System.out.println("How many steps should the ant take? ");
        step = scnr.nextInt();

        Random rand = new Random();

        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;

        StdDraw.setPenColor(Color.black);
        while (counter < step){
            v1 = rand.nextInt(3) - 1;
            v2 = rand.nextInt(3) - 1;

            if ((v1 == 0 && v2 != 0)||(v2 == 0 && v1 != 0) ){

                c = c + v1;
                d = d + v2;
                StdDraw.line(a, b, c, d);
                a = c;
                b = d;
                counter = counter + 1;

            }
            if (a > 20 || b > 20 || c > 20 || d > 20){

                System.exit(0);

            }


        }

    }
}
