package practice;

import java.util.*;
public class power_n {
    public static int expo(int num,int pow){
        if (pow == 0){
            return 1;
        }
        if (num == 0){
            return 0;
        }
        int eqn = expo(num,pow-1);
        int ans = num*eqn;
        return ans;
    }
    public static void main(String args[]){
        int a =0,b=1;
        System.out.println("Enter any natural number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the power of given natural number");
        int pow = sc.nextInt();
        System.out.println("The value of "+ num +" to the power "+ pow + " is:");
        int ans = expo(num,pow);
        System.out.println(ans);
    }
}
