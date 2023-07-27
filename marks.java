package practice;

import java.util.Scanner;
public class marks {
    public static void main(String[]args)
    {
        int input;
        int marks = 0;
        do {


        System.out.println("Enter 1 if you want to enter the practice.marks or enter 0 if you want to exit.");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        if (input == 1)
        {
            Scanner scc = new Scanner(System.in);
                    marks = scc.nextInt();
            if (marks >100){
                System.out.println("Please enter valid practice.marks of student.");
            }
            else if(marks >=90){
                System.out.println("Excellent practice.marks");
            } else if (marks <=90 && marks > 80) {
                System.out.println("Good practice.marks");
            }
            else if (marks <=80 && marks > 70) {
                System.out.println("Average practice.marks");
            }
            else if (marks <=70 && marks > 60) {
                System.out.println("Can improve");
            }
            else if (marks <=60 && marks > 50) {
                System.out.println("Require hard work");
            }
            else if (marks <= 50) {
                System.out.println("Failed ");
            }
            else {
                System.out.println("Passed");
            }
        }

        else if (input == 0){
            break;
        }
        else {
            System.out.println("Invalid option choice.");
        }
        }

        while (input != 0);
    }
}
