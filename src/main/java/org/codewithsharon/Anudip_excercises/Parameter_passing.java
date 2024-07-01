package org.codewithsharon.Anudip_excercises;
class Rectangle{
    int width;
    int length;
    void insert (int l, int w)
    {
        length =l;
        width = w;
    }
    void calculate (){
        System.out.println(length* width);
    }
}
public class Parameter_passing {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.insert(20, 30);
        r1.calculate();
        System.out.println(r1);
    }

}
