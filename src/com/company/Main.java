package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Boolean quit = false;

        while (!quit) {
            System.out.println("percent or press 999 to quit");
            int mark = input.nextInt();

            if (mark >= 80 && mark < 100) {
                System.out.println("a");
            } else {
                if (mark >= 70 && mark <= 79) {
                    System.out.println("b");
                }
                if (mark >= 60 && mark <= 69) {
                    System.out.println("c");
                }
                if (mark >= 50 && mark <= 59) {
                    System.out.println("d");
                }
                if (mark >= 40 && mark <= 49) {
                    System.out.println("e");
                }
                if (mark < 40) {
                    System.out.println("u");
                }
                if (mark > 100 || mark < 0 && mark != 999) {
                    System.out.println("not how maffs work");
                }
                if (mark == 999) {
                    quit = true;
                }

            }


        }

    }


}
