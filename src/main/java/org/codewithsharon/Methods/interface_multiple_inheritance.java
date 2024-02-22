package org.codewithsharon.Methods;
interface Father{
    abstract  void call();
    abstract  void talk();
}
interface  Mom {
    abstract void  call();
    abstract  void talk();
}
 class son  implements Father, Mom{
       public void call(){// should be assignd as public orelse it throws error
        System.out.println("calling");
    }
     public void talk(){
        System.out.println("talking");
    }
}
public class interface_multiple_inheritance {
    public static void main(String[] args) {
        son obj = new son();
        obj.call();
        obj.talk();

    }
}
