package com.company;

import java.io.IOException;
import java.util.Scanner;

//public class TryToTest {

//    public static void main(String[] args) throws IOException {
//
//        Scanner cs = new Scanner(System.in);
//        int ageVariable = cs.nextInt();
//
//        if (ageVariable>=3 && ageVariable<=7){
//            System.out.println("kinder");
//        } else if (ageVariable>=8 && ageVariable<=12) {
//            System.out.println("shool");
//        }
//        else {
//            System.out.println("end");
//        }
//    }
//}


     class BubbleSortExample {
        static void bubbleSort(int[] arr) {
            int n = arr.length;
            int temp = 0;
            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){
                    if(arr[j-1] > arr[j]){
                        //swap elements
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        public static void main(String[] args) {
            int arr[] ={3,60,35,2,45,320,5};

            System.out.println("Array Before Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            bubbleSort(arr);//sorting array elements using bubble sort

            System.out.println("Array After Bubble Sort");
            for(int i=0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
     }