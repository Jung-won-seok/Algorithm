import java.io.*;
import java.util.Scanner;

public class Beak_1260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println( A[i] );
        }
        System.out.println("\n");
    }
}
