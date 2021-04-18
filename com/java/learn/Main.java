package com.java.learn;

public class Main {
    public static void main(String[] args) {
        Person myPerson=new Person();
        myPerson.setName("John Doe");
        myPerson.setAge(34);

        System.out.println(myPerson.getName()+" is "+myPerson.getAge()+" years old!");

        //This would return an invisibilty i error
        // myPerson.name="John Doe";
        // System.out.println(myPerson.name);
    }
}
