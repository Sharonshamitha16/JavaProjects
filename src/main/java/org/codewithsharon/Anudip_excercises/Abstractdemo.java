package org.codewithsharon.Anudip_excercises;
abstract class Animal {
 public abstract void sound();
}
 class Lion extends Animal {
 public void sound() {
  System.out.println("Lion roars..!!!");
 }
}
class Crow extends Animal {
 public void sound() {
  System.out.println("crow sounds ..!!!");
 }
}
class Monkey extends Animal {
 public void sound() {
  System.out.println("monkey sounds..!!!");
 }
}
public class Abstractdemo {
 public static void main(String args[]) {
  Animal obj1 = new Lion();
  Animal obj2 = new Crow();
  Animal obj3 = new Monkey();
  obj1.sound();
  obj2.sound();
  obj3.sound();
 }
}