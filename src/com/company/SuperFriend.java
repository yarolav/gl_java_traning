package com.company;

public class SuperFriend  extends Friend{ // наследование хорошо когда унаслеование полностью
    String superpower;

    public SuperFriend(String name, int age, String superpower) {
        super(name, age);
        this.superpower = superpower;
    }

    @Override
    public String toString() {
        return "SuperFriend{" +
                "superpower='" + superpower + '\'' +
                "} " + super.toString();
    }
}
