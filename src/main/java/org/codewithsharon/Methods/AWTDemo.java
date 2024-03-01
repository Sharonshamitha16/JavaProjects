package org.codewithsharon.Methods;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AWTDemo {
    AWTDemo() {
        Frame frame = new Frame("simple form");

        Label username = new Label("Username:");
        username.setBounds(200, 120, 80, 30);
        TextField tx = new TextField("Enter your name:");
        tx.setBounds(325, 130, 150, 20);

        Label email = new Label("Email:");
        email.setBounds(200, 160, 100, 40);
        TextField emailIP = new TextField("Enter your email:");
        emailIP.setBounds(325, 170, 150, 20);

        Label age = new Label("Age:");
        age.setBounds(200, 200, 100, 40);
        TextField ageIP = new TextField("Enter your age:");
        ageIP.setBounds(325, 210, 150, 20);


        Label address = new Label("Address:");
        address.setBounds(200, 240, 100, 40);
        TextArea addressIP = new TextArea("Enter your address:");
        addressIP.setBounds(325, 250, 150, 70);

        Label phoneno = new Label("Phone Number:");
        phoneno.setBounds(200, 330, 100, 40);
        TextField phonenoIP = new TextField("Enter your phone number:");
        phonenoIP.setBounds(325, 340, 150, 20);


        Label gender = new Label("Gender:");
        gender.setBounds(200, 390, 100, 40);
        Checkbox male = new Checkbox("male");
        male.setBounds(325, 375, 70, 60);
        Checkbox female = new Checkbox("female");
        female.setBounds(395, 375, 70, 60);

        Choice country = new Choice();
        Label country1 = new Label("select country:");
        country1.setBounds(200, 435, 100, 40);
        country.setBounds(325, 445, 150, 150);
        country.add("Select Country");
        country.add("United States");
        country.add("Canada");
        country.add("United Kingdom");
        country.add("Australia");
        country.add("India");
        country.add("Germany");
        country.add("France");


        Button submit = new Button("Submit");
        submit.setBounds(300, 600, 80, 30);
        /********** this is one method anonymous method******************************/
        /* submit.addActionListener(new ActionListener() { // anonymous cls, were we create call a method without creating a cls here newActionListener is a anonymous cls we didn't create a cls
             @Override //we overriden the method actionperformed
             public void actionPerformed(ActionEvent actionEvent) {
                 System.out.println("Name: "+tx.getText());
                 System.out.println("Email: "+emailIP.getText());
                 System.out.println("Age: "+ageIP.getText());
                 System.out.println("Address: "+addressIP.getText());
                 System.out.println("Phone Number: "+phonenoIP.getText());
                 System.out.println("Gender: "+gender.getText());
                 System.out.println("Male: " + male.getState());
                 System.out.println("Female: " + female.getState());
                 System.out.println("selected country: "+country.getSelectedItem());
             }
         });*/
        /******************this is another method ****************/
        /* ActionListener submitListener = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 System.out.println("Name: "+tx.getText());
                 System.out.println("Email: "+emailIP.getText());
                 System.out.println("Age: "+ageIP.getText());
                 System.out.println("Address: "+addressIP.getText());
                 System.out.println("Phone Number: "+phonenoIP.getText());
                 System.out.println("Gender: "+gender.getText());
                 System.out.println("Male: " + male.getState());
                 System.out.println("Female: " + female.getState());
                 System.out.println("selected country: "+country.getSelectedItem());

             }
         };
         submit.addActionListener (submitListener);*/
        /**************THIS IS USING INTERFACEE   IMPLEMNTING THE PREDEFINED CLS TO THE CLS W CREAT AND CREATING A OBJECT AND CALLING THE METHOD******************/

        ButtonListener submitListener = new ButtonListener(tx, emailIP, ageIP, addressIP, phonenoIP, male, female, country);
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

        frame.add(country);
        frame.add(country1);

        frame.add(submit);
        frame.setBackground(Color.gray);
        frame.setSize(700, 700);
        frame.setLayout(null);

        //frame.add(submit);
        frame.setVisible(true);
        frame.setVisible(true);


    }


    public static void main(String[] args) {
        new AWTDemo();
    }
}

class ButtonListener implements ActionListener {
    TextField tx;
    TextField emailIP;
    TextField ageIP;
    TextArea addressIP;
    TextField phonenoIP;


    Checkbox male;
    Checkbox female;
    Choice country;


    ButtonListener(TextField tx, TextField emailIP, TextField ageIP, TextArea addressIP, TextField phonenoIP, Checkbox male, Checkbox female, Choice country) {

        this.tx = tx;
        this.emailIP = emailIP;
        this.ageIP = ageIP;
        this.addressIP = addressIP;
        this.phonenoIP = phonenoIP;

        this.male = male;
        this.female = female;
        this.country = country;


    }


    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Name: " + tx.getText());
        System.out.println("Email: " + emailIP.getText());
        System.out.println("Age: " + ageIP.getText());
        System.out.println("Address: " + addressIP.getText());
        System.out.println("Phone Number: " + phonenoIP.getText());

        System.out.println("Male: " + male.getState());
        System.out.println("Female: " + female.getState());
        System.out.println("selected country: " + country.getSelectedItem());

    }


}