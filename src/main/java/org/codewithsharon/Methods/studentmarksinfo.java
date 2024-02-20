package org.codewithsharon.Methods;

import org.w3c.dom.ls.LSOutput;

public class studentmarksinfo {
    String name;
    int rollno;
    int  science_mark;
    int maths_mark;
    int social_mark;
    int english_mark;
    int tamil_mark;

    studentmarksinfo(int sci, int math, int soc, int eng, int tam){
      science_mark =sci;
      maths_mark=math;
      social_mark=soc;
      english_mark=eng;
      tamil_mark=tam;
  }
  studentmarksinfo(int abssubjects){
        science_mark=maths_mark=social_mark=english_mark=tamil_mark;
  }
   void setvalues(int sci, int math, int soc, int eng, int tam){
       science_mark =sci;
       maths_mark=math;
       social_mark=soc;
       english_mark=eng;
       tamil_mark=tam;
   }

    public int totalmarks(){
        return  science_mark+ maths_mark+ social_mark+ english_mark+ tamil_mark;

    }
    public <String> void printvalues(String name, int rollno){
        System.out.println("--------------------------------------------");
        System.out.println("Name of the student is:"+ name);
        System.out.println("Roll no of the student is:"+rollno);

    }

}
