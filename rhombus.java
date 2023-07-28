package practice;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
            int i, j;
            System.out.println("Enter max number of row");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            System.out.println("Enter max number of column");
            Scanner sc2 = new Scanner(System.in);
            int col = sc2.nextInt();
            for (i = 1; i <= row; i++) {
                for (j = 1; j <= col; j++) {
                    if ((i + j) <= row || (i + j) >= (col+2)) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

                System.out.println();
            }
            }

        }

