package org.codewithsharon.Anudip_excercises;
class Student {
    int studId = 101;
    String studName = "sara";
    double studmark = 85.5;

}
class Standard extends Student {
    int StudStd = 10;
    char StudSec = 'A';
    String StudTeachName = "Mala";
    public static void main(String[] args) {
        Standard stdobj = new Standard();
        System.out.println("Student ID is: "+stdobj.studId);
        System.out.println("Student NAME is: "+stdobj.studName);
        System.out.println("Student MARK is: "+stdobj.studmark);
        System.out.println("Student STD is: "+stdobj.StudStd);
        System.out.println("Student SEC  is: "+stdobj.StudSec);
        System.out.println("Student Teacher Name is: "+stdobj.StudTeachName);
    }
}

