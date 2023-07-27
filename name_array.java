package practice;

import java.util.*;
public class name_array {
    public static void main(String[] args){
        System.out.println("Enter the size of the Array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter all the names:");
        String name[] = new String[size];
        for (int i = 0;i <= size-1;i++){
            name[i] = sc.next();
        }
        for (int i = 0;i <= name.length-1;i++)
        System.out.println("Name " + (i+1) + " is "+name[i]);
    }
}
