package org.codewithsharon.Methods;
import java.awt.*;
import java.net.PasswordAuthentication;

class simple extends Frame{
    simple(){
        TextField tx = new TextField("username");
        //PasswordAuthentication tx2 = new PasswordAuthentication("SHARON",char[1604]);
        Button bt = new Button("click ME!");
        add(tx);
         add(bt);
        setVisible(true);
         setLayout(new FlowLayout());
         setBackground(Color.blue);
         setSize(500,500);

         //setCursor(Cursor.getPredefinedCursor(y));
    }
}
public class AWTDEMO {
    public static void main(String[] args) {
        new simple();
    }

}
