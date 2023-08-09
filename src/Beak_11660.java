import java.io.*;
import java.util.Scanner;

public class Beak_11660 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[][] = new int[N+1][N+1];
        int D[][] = new int[N+1][N+1];
        A[0][0] = 0;
        D[0][0] = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                A[i][j]=sc.nextInt();
                D[i][j] = D[i - 1][j] + D[i][j - 1] - D[i - 1][j - 1] + A[i][j];
            }
        }

        for(int k=1;k<=M;k++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println(D[c][d]-D[a-1][d]-D[c][b-1]+D[a-1][b-1]);
        }
    }
}
