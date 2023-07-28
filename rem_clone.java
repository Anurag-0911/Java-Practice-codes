package practice;

import java.util.*;

public class rem_clone {
    public static boolean[] map = new boolean[26];
    public static void remove(String str,int idx,String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char CurrChar = str.charAt(idx);
        if (map[CurrChar-'a']==true){
            remove(str,idx+1,newString);
        }
        else {
            newString += CurrChar;
            map[CurrChar-'a'] = true;
            remove(str,idx+1,newString);
        }
    }
    public static void main(String args[]){
        int idx = 0;
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        remove(str,idx,"");
    }
}

