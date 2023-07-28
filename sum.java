package practice;//print practice.sum of n natural numbers using resursion
import java.util.*;
public class sum {
    public static void printsum(int i,int num,int sum){
        if (i >= num){
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        printsum(i+1,num,sum);
    }
    public static void main(String args[]){
        int sum =0,i=0;
        System.out.println("Enter any natural number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of natural number upto "+ num +" is");
        printsum(i,num,sum);
    }
}