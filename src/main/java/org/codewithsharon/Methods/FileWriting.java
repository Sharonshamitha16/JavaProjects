package org.codewithsharon.Methods;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            File f = new File("C:/Users/Sharon Shamitha/Documents/JavaProjects/src/main/java/org/codewithsharon/Methods/sample.txt");

            FileWriter fw = new FileWriter(f);
            fw.write("This line is added by the Filewiter class");
            //System.out.println(fw);
            fw.close();
        } catch (
                Exception e) {
            System.out.println(e);


        }
    }
}