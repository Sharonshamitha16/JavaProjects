package org.codewithsharon.Methods;

class applicationform{
    String name;
    int rollno;
    int age;
    String dept;
    public void display()
    {
        System.out.println("name is :"+name);
        System.out.println("rollno is :"+rollno);
        System.out.println("age is : "+ age);
        System.out.println("dept is :"+ dept);
    }
    public void setvalues(String studentname,int regno , int Age,String department ){
        name= studentname;
        rollno = regno;
        age= Age;
        dept= department;
        
    }

}
