package org.codewithsharon.Methods;

public class method {


    public static void main(String[] args) {
        sub(15,10);
        sub1();
        sub2();
         int res = sub3(12,10);
         res = res*10;
        System.out.println(res);

    }

    // void - parametrized
    public  static  void sub(int a , int b){
        int c= a-b;
        System.out.println(c);
    }
    // void -non parametrized
    public static void sub1(){
        int d= 10;
        int e = 8;
        int f = d-e;
        System.out.println(f);

    }
    // non -void  non-parametrized
    public static int sub2(){
        int g= 10;
        int h = 8;
        int i = g-h;
        return i;
    }
    // non -void  parametrized
    public static int sub3(int j, int k){

        int l = j-k;
        return l;
    }
}
