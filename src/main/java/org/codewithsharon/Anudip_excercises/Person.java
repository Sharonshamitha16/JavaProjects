package org.codewithsharon.Anudip_excercises;

public class Person {
    int id;
    String name;

    // Parameterized constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Person obj1 = new Person(1, "sharon");
        Person obj2 = new Person(2, "sam");


        System.out.println("Object 1: ID = " + obj1.id + ", Name = " + obj1.name);
        System.out.println("Object 2: ID = " + obj2.id + ", Name = " + obj2.name);
    }
}
