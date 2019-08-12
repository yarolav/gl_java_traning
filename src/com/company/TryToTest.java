package com.company;

import java.io.IOException;
import java.util.Scanner;

public class TryToTest {

    public static void main(String[] args) throws IOException {

        Scanner cs = new Scanner(System.in);
        int ageVariable = cs.nextInt();

        if (ageVariable>=3 && ageVariable<=7){
            System.out.println("kinder");
        } else if (ageVariable>=8 && ageVariable<=12) {
            System.out.println("shool");
        }
        else {
            System.out.println("end");
        }
    }
}
