package com.company;

import javax.crypto.Mac;

public class Friend {

     private String name; // доступны только в этом класе
//     protected  // доступно только в этом классе и в наследниках
     private int age; // доступно везде (подход инкапцуляции)

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToCinema() {
        System.out.println("Go go GO!!! " + name);

    }

    public String goToRest(String mac) {
        if ("Mac".equals(mac)) {
            return "No";
        }
        else {
            return "Yes";
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age>16 && age<40)
        this.age = age;
    }
}
