package com.company;

import java.util.Arrays;

public class LessonFive {
    public static void main(String[] args) {


//        int[] a = {1,2,3,4,5,6};
//        int[] [] a1 = {{1,2,3},{4,5,6}};
//        int[] b = new int[5];
//
//        System.out.println(a1[1][2]);

//        for (int i = 0; i <= a.length-1; i++) {
//            System.out.println(a[i]);
//        }

//        for (int i : b) {
//            System.out.println(i);
//        }


//        for (int i = 0; i <10; i++) {
//                if (i%2==0) continue;
//            System.out.println("i="+ i);
//        }

//        for (int i = 0; i <10; i++) {
//                if (i%2==0) ;
//            System.out.println("i="+ i);
//        }

//        String strInt = "123"; String strDouble = "123.456";
//        int x;
//        double y;
//        x = Integer.parseInt(strInt);
//        y = Double.parseDouble(strDouble);
//        System.out.println("x=" + x);
//        System.out.println("y=" + y);

        int[] a = {1, 2, 3, 4, 5};
        for (int i = 0; i <a.length/2 ; i++) {
            int tmp = a[i];
            a[i] = a[a.length - 1 - i];
             a[a.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(a));



    }


//    private static void reversArray(int [] a) {
//        int[] a = {1, 2, 3, 4, 5};
//        reversArray(a);
//        for (int i = 0; i <a.length/2 ; i++) {
//            int tmp = a[i];
//            a[i] = a[a.length - 1 - i];
//            a[a.length - 1 - i] = tmp;
//        }
//    }


}
