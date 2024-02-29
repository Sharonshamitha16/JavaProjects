package org.codewithsharon.Methods;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;

class simple {
    simple() {
        Frame frame = new Frame("simple form");

        Label username = new Label("Username:");
        username.setBounds(50,120,80,30);
        TextField tx = new TextField("Enter your name:");
        tx.setBounds(160,120,150,20);

        Label email = new Label("Email:");
        email.setBounds(50,170,100,40);
        TextField emailIP = new TextField("Enter your email:");
        emailIP.setBounds(170,170,150,20);

        Label age = new Label("Age:");
        age.setBounds(50,200,100,40);
        TextField ageIP = new TextField("Enter your age:");
        ageIP.setBounds(170,210,150,20 );


        Label address = new Label("Address:");
        address.setBounds(50,240,100,40);
        TextArea addressIP = new TextArea("Enter your address:");
        addressIP.setBounds(170,250,150,70);

        Label phoneno = new Label("Phone Number:");
        phoneno.setBounds(50,330,100,40);
        TextField phonenoIP = new TextField("Enter your phone number:");
        phonenoIP.setBounds(170,340,150,20);

        //Label gender =new Label("gender");
        Label gender =new Label("Gender:");
        gender.setBounds(50,390,100,40);
        Checkbox male =new Checkbox("male");
        male.setBounds(160,375,70,60);
        Checkbox female = new Checkbox("female");
        female.setBounds(245,375,70,60);

        Choice country = new Choice();




        Button submit = new Button("SUBMIT");
        submit.setBounds(100, 100, 80, 30);

        ActionListener submitListener = new ActionListener() {

            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(tx.getText());
                System.out.println(emailIP.getText());
                System.out.println(ageIP.getText());
                System.out.println(addressIP.getText());
                System.out.println(phonenoIP.getText());
                System.out.println("Male: " + male.getState());
                System.out.println("Female: " + female.getState());
            }
        };
               submit.addActionListener(submitListener);

        frame.add(username);
        frame.add(tx);

        frame.add(email);
        frame.add(emailIP);

        frame.add(age);
        frame.add(ageIP);

        frame.add(address);
        frame.add(addressIP);

        frame.add(phoneno);
        frame.add(phonenoIP);

        frame.add(gender);
        frame.add(male);
        frame.add(female);

        frame.add(submit);

        frame.setVisible(true);
        submit.setVisible(true);
        frame.setLayout(null);
        frame.setBackground(Color.yellow);
        frame.setSize(700, 700);

        //setCursor(Cursor.getPredefinedCursor(y));
    }
}

public class AWTDEMO {
    public static void main(String[] args) {
        new simple();
    }

}
