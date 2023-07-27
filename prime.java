package practice;

import java.util.Scanner;
public class prime{

    public static void main(String[]args) {
        int num = 0,i,flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is practice.prime or not: ");
        num = sc.nextInt();
        if (num==1){
            System.out.println("Your number should be greater than 1.");
        }
        else if (num==2){
            System.out.println("The one and only even prime number.");
        }
        else {
            for (i = 2; i <= (num / 3)+1; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(num + " is Prime number");

            }
        }

    }
}
