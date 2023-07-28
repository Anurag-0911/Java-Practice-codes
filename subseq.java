package practice;

import java.util.*;

public class subseq {
    public static void subsequence(String str,int idx,String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char Currchar = str.charAt(idx);
        subsequence(str,idx+1,newString+Currchar);
        subsequence(str,idx+ 1,newString);

    }
    public static void main(String args[]){
        int idx = 0;
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        subsequence(str,idx,"");
    }
}


