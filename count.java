package practice;

import java.util.*;

//frequency of any number

public class count{
    public static void main(String []args){
        int pos = 0,neg = 0,zero = 0;
        System.out.println("Enter 1 for input and 0 for exit:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1){
            System.out.println("Enter your number:");
            int num = sc.nextInt();
            if (num > 0){
                pos = pos+1;
            }
            else if (num < 0) {
                neg = neg + 1;
            }
            else if (num == 0){
                zero = zero+1;
            }
            System.out.println("Enter 1 for input and 0 for exit:");
            input = sc.nextInt();
            }
        System.out.println("Positive numbers are: "+pos);
        System.out.println("Negative numbers are: "+neg);
        System.out.println("Zeroes are: "+zero);
    }
}

