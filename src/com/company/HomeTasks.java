package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HomeTasks {

    public static void main(String[] args) throws Exception {

        /*
        Task from lessons
         */
        Scanner cs = new Scanner(System.in);
//        int ageVariable  = cs.nextInt();

//
//        if (ageVariable>=3 && ageVariable<=7){
//            System.out.println("kinder");
//        } else if (ageVariable>=8 && ageVariable<=16) {
//            System.out.println("shool");
//        }
//        else if (ageVariable>=17 && ageVariable<=23){
//            System.out.println("university");
//        }
//        else if (ageVariable>=24 && ageVariable<=65){
//            System.out.println("Working");
//        }
//        else if (ageVariable>=66 && ageVariable<=110)
//            System.out.println("retirement");
//        else {
//            System.out.println("end");
//        }

        /*
         The First home task
         */

//        Scanner cs = new Scanner(System.in);
//        String nameOfUser = cs.nextLine();
//        System.out.println("hello " + nameOfUser);

//        System.out.println("Hello " + new Scanner(System.in).next());

          /*
          The Second home task with the first example
           */

        int a [] = new int[5];
        for (int i  = 0; i < 5 ; i++) {
            a[i] = cs.nextInt();
        }
        for (int i = a.length; i > 0 ; i--) {
            System.out.println(i);
        }

          /*
          The Second home task with the second example
           */

        int b [] = {1,2,3,4,5};
        for (int i = b.length; i > 0 ; i--) {
            System.out.println(i);
        }

        /*
        The Third task - Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
         */

//        int a [] = {1,2,3,4,5};
//        for (int i : a) {
//            System.out.println(i); // с переходом
//            System.out.print(i); // без перехода
//        }

        /*
        Ввести пароль из командной строки и сравнить его со строкой-образцом
         */

//        Scanner sc = new Scanner(System.in);
//        String password1 = sc.nextLine();
//        String password2 = "qwerty123";
//        if (password1.equals(password2)){
//            System.out.println("password is ok");
//        } else System.out.println("password is wrong");

        /*
         Вывод четных числа.
         */

//        for (int i = 0; i < 10  ; i++) {
//            if (i%4==0)
//                System.out.println(i);
//        }

        /*
        Вывод не четных числе
         */

//        for (int i = 0; i < 100  ; i++) {
//            if (i%2!=0)
//            System.out.println(i);
//        }

    }
}
