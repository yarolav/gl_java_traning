package com.company;

public class LessonSeven {

    public static void main(String[] args) {
//        Friend friend = new Friend("Ira", 25);
//        System.out.println(friend);
//        friend.goToCinema();
//        System.out.println(friend.goToRest("Mac"));
//        Friend friend2 = new Friend ("Inna", 30);
//        System.out.println(friend2);
//        System.out.println(friend.getName());
//        System.out.println(friend2.getName());
//        friend.setAge(1000);
//        System.out.println(friend);
//        SuperFriend superFriend = new SuperFriend("Ket", 24, "cooker");
//        System.out.println(superFriend.superpower);

        m();
        m(12,13);
        m(12);
        m(10.2);
        m(1,2,3,4,5,6,7,8,9,10); // статический полиморфизм - один интерфейс а реализаций множество . статический полиморфизм использует перегрузку методов

    }

    private static void m(int a, int b) {
        System.out.println("(int a, int b)");
    }
    private static void m(double a) {
        System.out.println("(double a)");
    }
    private static void m( int ...a) {
        System.out.println("(int ...a)");
    }
    private static void m() {
        System.out.println("");
    }
    private static void m(int a) {
        System.out.println("(int a)");
    }  // overloud methods - перегруженые методы - имеют одно и тоже имя но отличаються количествои или типом пораметров
}