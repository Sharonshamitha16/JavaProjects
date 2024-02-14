package org.codewithsharon.Methods;

   class Student{
                String name;
                int rollno;
                int science_mark;
                int social_mark;
                int maths_mark;
                int english_mark;
                int tamil_mark;
                public int StudentTotal_marks()
                        {
                                return science_mark + social_mark + maths_mark + english_mark + tamil_mark;
                        }
                public int printStudentinfo(){
                        int totalmarks =  StudentTotal_marks();
                        System.out.println("name of the student:"+name);
                        System.out.println("rollno. of the student:"+rollno);
                        System.out.println("totalmarks of the student:"+totalmarks);

                    return totalmarks;
                }
}

public class Student_method {
        public static void main(String[] args) {
                Student  student1info = new Student();
                student1info.name = "SAM SANTOSH";
                student1info.rollno = 19104073;
                student1info.science_mark = 75;
                student1info.social_mark = 81;
                student1info.maths_mark = 91;
                student1info.english_mark = 82;
                student1info.tamil_mark = 77;
                //Studenttotal_marks.Student1info ();
                student1info.printStudentinfo();

                System.out.println(" student details and their total marks :"+student1info.printStudentinfo());

        }

}
