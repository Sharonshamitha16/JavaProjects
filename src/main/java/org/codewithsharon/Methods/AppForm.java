package org.codewithsharon.Methods;


public class AppForm {
    public static void main(String[] args) {
        applicationform student1= new applicationform();
        //student1.name ="sharon";
        //student1.rollno=19104073;
        student1.setvalues("sharon",4073);
        student1.display();

        applicationform student2 = new applicationform();
        //student2.name="saravanan";
        //student2.rollno=19104069;
        student2.setvalues("saravanan",4069);
        student2.display();

    }

}
