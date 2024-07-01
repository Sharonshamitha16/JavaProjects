package org.codewithsharon.java_spring_framework_with_springboot_6.corejava.array;

class  Student{
 String Studname;
 int StudID;
 char StudSec;
 String Studstd;
}
public class arrayofobject {
    public static void main(String[] args) {

    Student stud1 = new Student();
    stud1.Studname= "sharon";
    stud1.StudID =100;
    stud1.Studstd ="VII";
    stud1.StudSec ='A';

    Student stud2 = new Student();
    stud2.Studname= "sam";
    stud2.StudID =101;
    stud2.Studstd ="II";
    stud2.StudSec ='A';

    Student stud3 = new Student();
    stud3.Studname= "saran";
    stud3.StudID =103;
    stud3.Studstd ="III";
    stud3.StudSec ='C';

    Student stud4 = new Student();
    stud4.Studname= "saki";
    stud4.StudID =105;
    stud4.Studstd ="IX";
    stud4.StudSec ='A';

    Student studarr [] = new Student[4];
    studarr[0] = stud1;
    studarr[1]= stud2;
    studarr[2]=stud3;
    studarr[3]=stud4;

    for (Student newstudarr : studarr){
        System.out.println("NAME OF THE STUDENT IS: " +newstudarr.Studname + " AND STUDENT ID IS :" +
                newstudarr.StudID  +" STUDENT SEC AND STD IS :"
                + newstudarr.Studstd + " STD  AND "  + newstudarr.StudSec);
    }

    }
}
