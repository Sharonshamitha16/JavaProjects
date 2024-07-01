package org.codewithsharon.Anudip_excercises;
 class Rectangle1{
 int length;
 int breadth ;
 String color;
 Rectangle1(int l, int b
 ){
     length=l;
     breadth=b;
     color="green";
 }
 Rectangle1(int l, int b , String c){
     length =l;
     breadth= b;
     color =c;
 }
void display()
{
    System.out.println("Length is :" + length + " , Breadth is :" + breadth + " ,Color is :" + color);
}
 }

public class method_overoading {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1(20,40,"yellow");
        Rectangle1 r2 = new Rectangle1(20,40);
        r1.display();
        r2.display();
    }
}
