package com.company;

public class Girl {

    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void goToCinema (){
        System.out.println("Go go go!!! - " + name);
    }

     String goToRest(String restName){
        if ("MAC".equals(restName))
            return "No - " + name;
         else
             return "Yes - " + name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
