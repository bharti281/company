package com.company;

public class Fibonacci_series {

    static int fibonacci(int n){
        if(n==1||n==2)
        {
          return n-1;
        }
        else
        {
            return (fibonacci(n-1)+fibonacci(n-2));

        }



    }
    public static void main(String[] args) {

        int c = fibonacci(5);
        System.out.println(c);

    }
}
