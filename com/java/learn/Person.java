package com.java.learn;
/**
 * Encapsulation hides sensitive data from users
 * This is achieved by declaring class variables/attributes as private
 * Providing getter and setter methods to access and update the values 
 * of private attributes
 */
public class Person{
    private String name;
    private int age;

    /** Getter methods */
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    /**Setter method */
    public void setName(String name){

        /**this keyword  refers to the current object*/
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

}