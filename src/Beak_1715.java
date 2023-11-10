import java.io.*;
import java.util.Scanner;

public class Beak_1715 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int b = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        static void permutation(int[] A, int depth, int N, int r) { //배열A의 모든 경우의 수
            for (int i = depth; i < N; i++) {
                swap(A, depth, i);
                permutation(A, depth + 1, N, r);
                swap(A, depth, i);
            }
        }
        static void swap(int[] A, int depth, int i) {
            int temp = A[depth];
            A[depth] = A[i];
            A[i] = temp;
        }
        b = A[0] + A[1];  //카드의 합 구하기
        sum = b;
        for (int j = 2; j < N; j++) {
            b = b + A[j];
            sum = sum + b;
        }
        System.out.println(sum);
    }

    private static void permutation(int[] a, int i, int n, int r) {

    }

    private static void swap(int[] a, int depth, int i) {
    }
}