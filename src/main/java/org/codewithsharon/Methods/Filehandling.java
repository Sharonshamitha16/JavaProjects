package org.codewithsharon.Methods;
import java.io.File;
import  java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) {
        try{
            File f = new File("scratch.txt");
            Scanner reader =  new Scanner(f);
        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
