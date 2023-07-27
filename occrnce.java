package practice;

import java.util.*;

public class occrnce {
    public static int first = -1;
    public static int last = -1;
    public static void Occurence(String str,int idx,char ele) {
        if (idx==str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char CurrChar = str.charAt(idx);
        if (CurrChar == ele){
            if (first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        Occurence(str,idx+1,ele);
    }
    public static void main(String args[]){
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter from which index you want to check occurence:");
        int idx = sc.nextInt();
        System.out.println("Enter the element whose occurence you want to check:");
        char ele = sc.next().charAt(0);
        Occurence(str,idx,ele);
    }
}
