package practice;//public class practice.test_string {
////    public static void main(String args[]) {
////        String str = "123";
////        int number = Integer.parseInt(str);
////        System.out.println(number);
//
////    public static void main(String args[]) {
////        int number = 123;
////        String str = Integer.toString(number);
////        System.out.println(str.length());
//
//
//    }
//
//    }


import java.util.*;

public class test_string {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;

        for(int i=0; i<size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }

        System.out.println(totLength);
        for (int i = size-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
}

