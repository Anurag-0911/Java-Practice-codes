package practice;

import java.util.*;
public class fibonacci {
    public static void printsum(int a,int b,int num){
        if (num ==0 ){
            return;
        }
        System.out.println(a);
        printsum(b,a+b,num-1);
    }
    public static void main(String args[]){
        int a =0,b=1;
        System.out.println("Enter any natural number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Fibonacci series upto "+ num +" is");
        printsum(a,b,num);
    }
}
