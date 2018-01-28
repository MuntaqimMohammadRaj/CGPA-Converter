package wow;

import java.util.Scanner;

public class Wow{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Result;
        double Grade = 0;
        double fres = 0;
        double sres = 0;
        double tres = 0;
        double fores = 0;
        double fires = 0;

        //Target
        System.out.print("Enter your target SGPA: ");
        double target = sc.nextDouble();

        //First course
        System.out.print("Enter 1st course credit: ");
        int fCredit = sc.nextInt();

        System.out.print("Enter 1st course result: ");
        Result = sc.nextInt();

        if (Result >= 80) {
            Grade = 4.00;

        } else if (Result >= 75 && Result < 80) {
            Grade = 3.75;

        } else if (Result >= 70 && Result < 75) {
            Grade = 3.50;

        } else if (Result >= 65 && Result < 70) {
            Grade = 3.25;

        } else if (Result >= 60 && Result < 65) {
            Grade = 3.00;

        } else if (Result >= 55 && Result < 60) {
            Grade = 2.75;

        } else if (Result >= 50 && Result < 55) {
            Grade = 2.50;

        } else if (Result >= 45 && Result < 50) {
            Grade = 2.25;

        } else if (Result >= 40 && Result < 45) {
            Grade = 2.00;

        } else if (Result < 40) {
            Grade = 0;

        }

        fres = fCredit * Grade;

        System.out.println("");

        //Second course
        System.out.print("Enter 2nd course credit: ");
        int sCredit = sc.nextInt();

        System.out.print("Enter 2nd course result: ");
        Result = sc.nextInt();
        if (Result >= 80) {
            Grade = 4.00;

        } else if (Result >= 75 && Result < 80) {
            Grade = 3.75;

        } else if (Result >= 70 && Result < 75) {
            Grade = 3.50;

        } else if (Result >= 65 && Result < 70) {
            Grade = 3.25;

        } else if (Result >= 60 && Result < 65) {
            Grade = 3.00;

        } else if (Result >= 55 && Result < 60) {
            Grade = 2.75;

        } else if (Result >= 50 && Result < 55) {
            Grade = 2.50;

        } else if (Result >= 45 && Result < 50) {
            Grade = 2.25;

        } else if (Result >= 40 && Result < 45) {
            Grade = 2.00;

        } else if (Result < 40) {
            Grade = 0;

        }

        sres = sCredit * Grade;

        System.out.println("");

        //Third course
        System.out.print("Enter 3rd course credit: ");
        int tCredit = sc.nextInt();

        System.out.print("Enter 3rd course result: ");
        Result = sc.nextInt();

        if (Result >= 80) {
            Grade = 4.00;

        } else if (Result >= 75 && Result < 80) {
            Grade = 3.75;

        } else if (Result >= 70 && Result < 75) {
            Grade = 3.50;

        } else if (Result >= 65 && Result < 70) {
            Grade = 3.25;

        } else if (Result >= 60 && Result < 65) {
            Grade = 3.00;

        } else if (Result >= 55 && Result < 60) {
            Grade = 2.75;

        } else if (Result >= 50 && Result < 55) {
            Grade = 2.50;

        } else if (Result >= 45 && Result < 50) {
            Grade = 2.25;

        } else if (Result >= 40 && Result < 45) {
            Grade = 2.00;

        } else if (Result < 40) {
            Grade = 0;

        }

        tres = tCredit * Grade;

        System.out.println("");

        //Fourth course
        System.out.print("Enter 4th course credit: ");
        int foCredit = sc.nextInt();

        System.out.print("Enter 4th course result: ");
        Result = sc.nextInt();
        if (Result >= 80) {
            Grade = 4.00;

        } else if (Result >= 75 && Result < 80) {
            Grade = 3.75;

        } else if (Result >= 70 && Result < 75) {
            Grade = 3.50;

        } else if (Result >= 65 && Result < 70) {
            Grade = 3.25;

        } else if (Result >= 60 && Result < 65) {
            Grade = 3.00;

        } else if (Result >= 55 && Result < 60) {
            Grade = 2.75;

        } else if (Result >= 50 && Result < 55) {
            Grade = 2.50;

        } else if (Result >= 45 && Result < 50) {
            Grade = 2.25;

        } else if (Result >= 40 && Result < 45) {
            Grade = 2.00;

        } else if (Result < 40) {
            Grade = 0;

        }

        fores = foCredit * Grade;

        System.out.println("");

        //Fifth course
        System.out.print("Enter 5th course credit: ");
        int fiCredit = sc.nextInt();

        System.out.print("Enter 5th course result: ");
        Result = sc.nextInt();
        if (Result >= 80) {
            Grade = 4.00;

        } else if (Result >= 75 && Result < 80) {
            Grade = 3.75;

        } else if (Result >= 70 && Result < 75) {
            Grade = 3.50;

        } else if (Result >= 65 && Result < 70) {
            Grade = 3.25;

        } else if (Result >= 60 && Result < 65) {
            Grade = 3.00;

        } else if (Result >= 55 && Result < 60) {
            Grade = 2.75;

        } else if (Result >= 50 && Result < 55) {
            Grade = 2.50;

        } else if (Result >= 45 && Result < 50) {
            Grade = 2.25;

        } else if (Result >= 40 && Result < 45) {
            Grade = 2.00;

        } else if (Result < 40) {
            Grade = 0;

        }

        fires = fiCredit * Grade;

        System.out.println("");

        int ncredit = fCredit + sCredit + tCredit + foCredit + fiCredit;
        System.out.println("Credit:" + ncredit);
        double Res = sres + sres + tres + fores + fires;

        System.out.println("Result: " + Res);

        double finalResult = Res / ncredit;

        System.out.println("Your SGPA is: " + finalResult);

        double semires = target - finalResult;
        double next = target + semires;

        System.out.println("Next semi you have to gain: " + next);
    }

}
