package org.codewithsharon.Methods;

import java.util.Date;

class Employee{
    String name;
    double salary;
    Date date;
    Employee( String n, int s){ //constructor
        name =n;
        salary =s;
    }
    void  setsalary(double s){ //method def
        double salary =s;
    }
    double getsalary(){ //method def
        return salary;
    }
    void setName(String n){ //method def
        name =n;
    }
    String getName(){//method def
        return name;
    }
    void raisesalary(double percent){ //method def
        salary= salary+salary*percent/100;
    }
    char[] displayinfo(){ //method def for displaying name and salary
        System.out.println("Employee name is "+name);
        System.out.println("Employee salary is "+getsalary());

        return new char[0];
    }


}
class Manager extends  Employee{ //inheritance
 double bonus;
    Manager(String n, int s) { //constructor
        super(n, s); // used super keyword to call from the superclass/parent class
    }
    double getsalary(){  //this is to add the bonus got method from the parent class so super keyword is used
       return  super.getsalary()+bonus;
    }
    void setBonus(double b){
        bonus =b;
    }
    double getBonus(){
        return  bonus;
    }
}
public class EmployeeInheritance {
    public static void main(String[] args) {
         Employee  emp1 = new Employee("sam",35000);
        Employee  emp2 = new Employee("joel",37000); // polymorphism
       // System.out.println(emp1.getsalary());
        System.out.println("----------------using method call----------------");
        emp1.displayinfo();
        Manager man1 = new Manager("saravanan", 65000);
        Manager man2 = new Manager("sakila", 63000);
        man1.setBonus(20000);
        man2.setBonus(20000);
        man1.displayinfo();
        man2.displayinfo();
        System.out.println("-------------using array------------------");
        Employee emplooyees[]=  new Employee[3];
        emplooyees[0]=new Employee("sharon",27000);
        emplooyees[1]=new Employee("shamitha", 18500);
        emplooyees[2]=new Manager("Saravanan",65000);
        Manager man3= (Manager)emplooyees[2];
        man3.setBonus(20000);
        for (Employee e:emplooyees){ //for each loop for printing the entire employee detials
            System.out.println(e.displayinfo());
        }
        System.out.println("------the end----------");

    }
}
