package org.codewithsharon.Methods;
class Box1 { //(SA)=2lw+2lh+2hw
    int height;
    int length;
    int width;

    public int SurfaceArea() {
        int i = 2 * (length * width + length * height + height * width);
        return i;
    }
    public void Surfacearea( int height,int width,int length){
        int i = 2 * (length * width + length * height + height * width);
    }
}
public class SurfaceArea_Method {
    public static  void main(String[] args) {
        Box1 MethodBox = new Box1();
        MethodBox.height=10;
        MethodBox.length=8;
        MethodBox.width=15;
        MethodBox.SurfaceArea();
        MethodBox.Surfacearea(10,8,15);
        System.out.println("surface area of the methodbox is : " +MethodBox.SurfaceArea() );
        //System.out.println("surface area of the methodbox is : ");

    }
}

