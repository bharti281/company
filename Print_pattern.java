package com.company;

public class Print_pattern {
    public static void main(String[] args) {
        int n=10;
        for(int i=n;i>0;i--)
        {
           for(int j=0 ;j<i;j++)
           {
               System.out.print("*");
           }
            System.out.print("\n");
        }

    }
}
