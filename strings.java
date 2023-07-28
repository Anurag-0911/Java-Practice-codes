package practice;

import java.util.*;

public class strings {
    public static void main(String args[]) {
        String name1 = "Tony";
        String name2 = "Tony";
        String names = "My name is Anurag";
        if(name1.equals(name2)) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different practice.strings");
        }

        //DO NOT USE == to check for string equality
        //Gives correct answer here
        if(name1 == name2) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different practice.strings");
        }

        //Gives incorrect answer here
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different practice.strings");
        }
        System.out.println(names.substring(4));

    }
}
