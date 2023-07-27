package practice;//Factorial using recursion
import java.util.*;
public class product {
//    public static void practice.factorial(int i,int num,int multp){
//        if (i >= num) {
//            multp *= i;
//            System.out.println(multp);
//            return;
//        }
//        multp*=i;
//        practice.factorial(i+1,num,multp);
//    }
    public static int factorial(int num){
        if (num <= 1) {
        return 1;
        }
        int mult = factorial(num-1);
        int ans = num*mult;
        return ans;
    }
    public static void main(String args[]){
        int ans=1;
        System.out.println("Enter the number whose practice.factorial you want to print:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Factorial of "+num+" is:");
        ans =factorial(num);
        System.out.println(ans);
    }
}
