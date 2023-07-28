package practice;

import java.util.Scanner;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int num1, num2,num3;
//String name1 = "Aman and Akku";
//        String name2 = "Chaman";
//        System.out.println(name1 + name2);
//        System.out.println(name1.substring(4,13));

//        {
//            String str="HELLO";
//            char ch[]=str.toCharArray();
//            for(int i=0;i<ch.length;i++){
//                System.out.println(ch[i]);
//            }
//        }
        System.out.println("Enter two numbers ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
//        int practice.sum = num1 +  num2;
//        System.out.println(practice.sum);
        if (num1 == num2){
            System.out.println("num1 is equal to num2");
        } else if (num1>num2) {
            System.out.println("num1 is greater than num 2");
        }
        else {
            System.out.println("num2 is greater than num 1");
        }
    }
}

