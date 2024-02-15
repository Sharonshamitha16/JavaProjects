package org.codewithsharon.Methods;

class digitssumtemplate { //class template of object
    int num;
    public int calculate_digitsofsum(int num) { //non void paramterized  method
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

