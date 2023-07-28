package practice;

import java.util.*;
public class search_in_matrix {
    public static void main(String args[]) {
        System.out.println("Enter the number of rows of the practice.matrix:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter the number of columns of the practice.matrix:");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter the elements of the practice.matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter the element you want to search in practice.matrix:");
        int key = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Your key value " + key + " is found at location (" + i + "," + j + ")");
                }
            }
        }
    }
}

