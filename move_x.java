package practice;

import java.util.*;

public class move_x {
    public static int first = -1;
    public static int last = -1;
    public static void move(String str,int idx,int count,String newString) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char CurrChar = str.charAt(idx);
        if (CurrChar == 'x'){
            count++;
            move(str,idx+1,count,newString);
        }
        else {
            newString += CurrChar;
            move(str,idx+1,count,newString);
        }
    }
    public static void main(String args[]){
        int idx = 0,count = 0;
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        move(str,idx,count,"");
    }
}

