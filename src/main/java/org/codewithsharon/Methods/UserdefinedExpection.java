package org.codewithsharon.Methods;

class UserDefined extends Exception {
    UserDefined(String str) {//CONSTRUCTOR
        super(str);
    }
}

public class UserdefinedExpection  {
    static void check(int age) throws UserDefined {
        if (age < 18) {
            throw new UserDefined("Age is invalid");// OBEJCT CRETING FOR USERDFIND CLS HAVING DATATYPE PRINTED
        } else {
            throw new UserDefined("Age is valid");
        }
    }
    public static void main (String args[]) {
            try {
                check(17);
            }
            catch (UserDefined E) {
                System.out.println(E.getMessage());

            }
            finally {
                System.out.println("final block ");
            }
        }
    }

