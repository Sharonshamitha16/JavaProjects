package org.codewithsharon.Methods;

import java.awt.print.Printable;

class Table
{
     synchronized void Printtable(int n)
    {
        for (int i = 1; i < 10; i++)
        {
            System.out.println(n * i);
            try
            {
                Thread.sleep(2000);
            }
            catch (Exception e) {}
        }
    }
}

public class TableSynchronized
{
    public static void main(String[] args)
    {
        Table t = new Table();

        Thread t1 = new Thread()
        {
            public void run()
            {
                t.Printtable(5);

            }
        };
        Thread t2 = new Thread()
        {
            public void run()
            {
                t.Printtable(10);
            }
        };
        if (t1.isAlive() && t2.isAlive()){
            System.out.println("still executing...");
        }
        t1.start();
        t2.start();
        if (t1.isAlive() && t2.isAlive()){
            System.out.println("still executing...");
        }
    }
}


