package com.company;

public class LessonSix {

    public static void main(String[] args) {
        Girl girl1 = new Girl("Ira", 22);
        System.out.println(girl1.toString());
        Girl girl2 = new Girl("Inna", 23);
        System.out.println(girl2.toString());

        girl1.goToCinema();
        System.out.println(girl1.goToRest("MAC" ));
        System.out.println(girl2.goToRest("Кулиничи"));
    }
}


// консткрутор . класс . объект 