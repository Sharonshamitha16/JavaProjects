package org.codewithsharon.oops;

class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }
     Employee(){
        name ="";
        salary =0.0;
     }

    public void setsalary(double s) {
        salary = s;
    }

    public void setname(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    double raisesalary(double percentage) {
        return salary += percentage / 100;
    }
}
class Manager extends Employee{
  int bonus;
  Manager(int b){
      bonus =b;
  }
  public void setbonus(int b){
      bonus =b;
  }
  public int getbonus(){
      return bonus;
  }
  public int doublebonus(int bonus){
      return bonus+=salary;
  }

}

public class inheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("sam", 30000);
        e1.getSalary();
        System.out.println("salary of employee " + e1.getName() + " is : " + e1.getSalary());
    }
}
