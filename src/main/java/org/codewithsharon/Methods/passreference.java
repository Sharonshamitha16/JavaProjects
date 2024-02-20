package org.codewithsharon.Methods;
class Boxes {
    int height;
    int breadth;
    int length;

    Boxes(int h, int b, int l) {
        height = h;
        breadth = b;
        length = l;
    }

    boolean isequal(Boxes b) {
        b.height++;
        if (b.length == length && b.height == height && b.breadth == breadth)
            return true;

        return false;
    }

     Boxes doublebox() {
        Boxes tmp = new Boxes(2 * height, 2 * breadth, 2 * length);

        return tmp;

        /*this.height=2*height;
        this.breadth=2*breadth;
        this.length=2*length;
        return doublebox();*/


    }
}
        public class passreference {
            static int increment(int a) {

                return a++;
            }

            public static void main(String[] args) {
                int a = 10;
                increment(a);
                System.out.println(a);// not incremented as its call by value uses stack storage
                Boxes b1 = new Boxes(1, 2, 3);
                Boxes b2 = new Boxes(1, 2, 3);
                Boxes b3 = b1.doublebox();
                System.out.println(b1.doublebox());
                System.out.println(b1.isequal(b2));
                System.out.println(b2.height);//incremented as it call by reference uses haep storage where address is only referced.

            }
        }
