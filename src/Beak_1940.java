import java.io.*;
import java.util.Scanner;
public class Beak_1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N];
        for(int k=0;k<N;k++){
            A[k]=sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < N-1; i++) {
            for (int j = i+1; j < N; j++) {
                if (A[i] + A[j] == M) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
