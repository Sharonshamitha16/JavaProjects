package org.codewithsharon.Methods;
import javax.management.StringValueExp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tally_counter extends Frame {
    TextField display;
    Label displaylabel;
    Button increment, reset;
    Tally_counter(){


        Label displaylabel = new Label("Set Number");
        displaylabel.setBounds(70,100,70,40);
        TextField display = new TextField("set number to increment");
        display.setBounds(150,110,140,20);

        Button reset = new Button("Reset");
        reset.setBounds(230,150,60,20);
        reset.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent actionEvent) {
                display.setText("0");
            }
        });
        Button increment = new Button("Increment");
        increment.setBounds(150,150,70,20);
        increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num =Integer.parseInt(display.getText());
                display.setText(String.valueOf(++num));
            }
        });
        add(displaylabel);
        add(increment);
        add(reset);
        add(display);
         setLayout(null);
         setSize(350,300);
         setTitle("Tally_Counter");
         setBackground(Color.yellow);
         setVisible(true);

        }

    public static void main(String[] args) {
        new Tally_counter();

    }
    }

