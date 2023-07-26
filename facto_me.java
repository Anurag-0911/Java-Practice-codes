package practice;

import java.util.*;
public class facto_me {
    public static void facto(int num,int opr){
        if (num == 0){
            System.out.println(opr);
            return;
        }
        opr = opr*num;
        facto(num-1,opr);
    }
    public static void main(String args[]){
        int opr=1;
        System.out.println("Enter the number whose practice.factorial you want to print:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is:");
        facto(num,opr);
    }
}
