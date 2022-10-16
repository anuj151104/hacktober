package array_2d;

import java.util.Scanner;

public class ColumnWise2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:- ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols:- ");
        int cols = sc.nextInt();
        int[][]arr = new int[rows][cols];
        for(int j=0;j<cols;j++){
            for(int i=0;i<rows;i++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
