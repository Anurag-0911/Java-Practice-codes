package practice;

import java.util.*;
public class unique_subseq {
    public static void subsequence(String str,int idx,String newString,HashSet<String>set) {
        if (idx == str.length()) {
            if (set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char Currchar = str.charAt(idx);
        subsequence(str,idx+1,newString+Currchar,set);
        subsequence(str,idx+ 1,newString,set);

    }
    public static void main(String args[]){
        int idx = 0;
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        subsequence(str,idx,"",set);
    }
}