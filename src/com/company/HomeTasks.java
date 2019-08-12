package com.company;

import java.util.Scanner;

public class HomeTasks {
    public static void main(String[] args) throws Exception {

        /*
        Task from lessons
         */
        Scanner cs = new Scanner(System.in);
        int ageVariable = cs.nextInt();

        if (ageVariable>=3 && ageVariable<=7){
            System.out.println("kinder");
        } else if (ageVariable>=8 && ageVariable<=16) {
            System.out.println("shool");
        }
        else if (ageVariable>=17 && ageVariable<=23){
            System.out.println("university");
        }
        else if (ageVariable>=24 && ageVariable<=65){
            System.out.println("Working");
        }
        else if (ageVariable>=66 && ageVariable<=110)
            System.out.println("retirement");
        else {
            System.out.println("end");
        }

        /*
         The First home task
         */

    }
}
