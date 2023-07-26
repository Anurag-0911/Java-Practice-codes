package practice;

import java.util.*;
public class keypad {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printkey(String str,int idx,String combination) {
        if (idx == str.length()){
            System.out.println(combination);
            return;
        }
        char CurrChar = str.charAt(idx);
        String mapping = keypad[CurrChar-'0'];
        for (int i=0;i<mapping.length();i++){
            printkey(str,idx+1,combination+mapping.charAt(i));
        }
        }
    public static void main(String args[]){
        int idx = 0;
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        printkey(str,idx,"");
    }
}
