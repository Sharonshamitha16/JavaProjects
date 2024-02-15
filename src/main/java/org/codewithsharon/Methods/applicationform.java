package org.codewithsharon.Methods;

class applicationform{
    String name;
    int rollno;
    public void display()
    {
        System.out.println("name is :"+name);
        System.out.println("rollno is :"+rollno);
    }
    public void setvalues(String studentname,int regno){
        name= studentname;
        rollno = regno;
    }

}
