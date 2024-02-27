package org.codewithsharon.Methods;

public class VarargsDemo {
    static int minvalue(int... vals) {
        int min = Integer.MAX_VALUE;
        for (int k : vals) {// for each loop
            if (k < min)
                min = k;
        }
        return min;
    }

    static double minvalue(double... vals1) {
        double min = Double.MAX_VALUE;
        for (double l : vals1) {
            if (l < min) {
                min = l;


            }
        }
        return min;
    }

    public static void main(String[] args) {
        int m = minvalue(1, 3, 4, 5, 9, 8, 0, -4);
        int h = minvalue();
        System.out.println(h);
        System.out.println(m);
        int n = minvalue(-1, -4, -7, 0, 5, 2, 5);
        System.out.println(n);
        double d = minvalue(2.0, -1.3, 8.9, -7.7);
        System.out.println(d);
        double f = minvalue();


    }
}
