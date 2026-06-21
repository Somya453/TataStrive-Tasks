package HomeWork;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();  //rows
        int m = sc.nextInt();  //col

        int[][] arr=new int[n][m];


        for (int i=0; i<n; i++){
            for (int j=0;j<m; j++){
                arr[i][j] = sc.nextInt();

            }}

        // Print transpose
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();


        }
    }
}
