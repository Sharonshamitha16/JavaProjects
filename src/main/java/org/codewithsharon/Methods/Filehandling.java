package org.codewithsharon.Methods;
import java.io.File;
import  java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) {
        try{
            File f = new File("C:/Users/Sharon Shamitha/Documents/JavaProjects/src/main/java/org/codewithsharon/Methods/sample.txt");
            Scanner reader =  new Scanner(f);
            while(reader.hasNextLine()){// this checks whether we have next line to print if it is then true if not gets out of loop
                System.out.println(reader.nextLine());
            }

        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
