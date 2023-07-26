package practice;

import java.util.*;

public class Hanoi {
    public static void Tower_of_Hanoi(int disc, String src, String hlp, String dest) {
        if (disc == 1) {
            System.out.println("Disc " + disc + " is Transferred from " + src + " to " + dest);
            return;
        }
        Tower_of_Hanoi(disc - 1, src, dest, hlp);
        System.out.println("Disc " + disc + " is Transferred from " + src + " to " + dest);
        Tower_of_Hanoi(disc - 1, hlp, src, dest);

//        System.out.println("Disc "+disc+" is Transferred from "+hlp+" to "+src);
    }
    public static void main(String args[]){
        System.out.println("Enter the number of disks:");
        Scanner sc = new Scanner(System.in);
        int disc = sc.nextInt();
        Tower_of_Hanoi(disc,"S","H","D");
    }
}
