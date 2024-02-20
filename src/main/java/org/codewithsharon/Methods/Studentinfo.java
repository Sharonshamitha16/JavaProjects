package org.codewithsharon.Methods;

public class Studentinfo {
    public static void main(String[] args) {
        studentmarksinfo student1 = new studentmarksinfo(80,75,87,88,80);
        student1.printvalues("sharon" ,4073);
        System.out.println("The totalmarks of the student1:"+student1.totalmarks());

        studentmarksinfo student2 = new studentmarksinfo(90,92,97,88,90);
        student2.printvalues("saravanan", 4069);
        System.out.println("The totalmarks of the student2:"+student2.totalmarks());

        studentmarksinfo student3 = new studentmarksinfo(89,77,90,88,83);
        student3.printvalues("sam",4070);
        System.out.println("The totalmarks of the student3:"+student3.totalmarks());

        studentmarksinfo student4 =new studentmarksinfo(90,88,92,81,87);
        student1.printvalues("saki", 4010);
        System.out.println("The totalmarks of the student4:"+student4.totalmarks());
        new studentmarksinfo(00);

        System.out.println("the totalmarks of the student0 as student absent the marks were:"+ new studentmarksinfo(00));
    }
}
