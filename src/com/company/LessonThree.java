package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LessonThree {

    public static void main(String[] args) throws Exception {

//        int a = 10;
//
//        switch (a) {
//            case 1:
//
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Work day");
//                break;
//            case 6:case 2:
//            case 7:
//                System.out.println(" Day Off");
//                break;
//            default:
//                System.out.println("default");
//        }

//        int i = 0;
//        while (i<=100) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println(i);

        // пример работы цикла do while
/*        int i = 100;
        do {
            System.out.println(i);
        } while (i<100);*/

//        for (int i = 0; i < 100 ; i++) {
//            System.out.println(i);
//        }
        // вывод четных чисел
//        for (int i = 0; i < 100  ; i++) {
//            if (i%2==0)
//            System.out.println(i);
//        }
        // вывод не четных
//        for (int i = 0; i < 100  ; i++) {
//            if (i%2!=0)
//            System.out.println(i);
//        }

//        int i [] = {1,2,3,4,5};
//        System.out.println(i[0]);
//
//        int a [] = {1,2,3,4,5};
//        System.out.println(a[a.length-1]);

        int b [] = {1,2,3,4,5};
//        for (int i : b) {
//            System.out.println("i=" +i);
//        }

//        for (int i = 0; i < b.length ; i++) {
//            System.out.println(b[i]);

//        Arrays.stream(b).forEach(System.out::println);

/*        int c [] = new int[5];

        System.out.println(Arrays.toString(c));*/

        System.out.println(Arrays.toString(args));

    }
}
