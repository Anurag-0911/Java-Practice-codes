package practice;

import java.util.Scanner;

public class factorial {

    public static void main(String[]args){
        int num = 0,i;
        int fact = 1;
        System.out.println("Enter any Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("The practice.factorial of given number is: ");
        for (i = 1;i <= num;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
