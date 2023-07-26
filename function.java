package practice;

import java.util.*;

//practice.sum of n odd numbers

public class function{
    public static void sum (int num){
        int psum = 0;
        for (int i = 1;i <= num;i++){

            if (i%2 != 0){
                psum+=i;
            }
        }
        System.out.println(psum);
    }
    public static void main(String[] args){
        System.out.println("Enter the maximum number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of odd numbers upto given number is:");
        sum(num);

    }
}
