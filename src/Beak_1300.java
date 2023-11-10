import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Beak_1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int A[][] = new int[N][N];  //2차원 배열A
        int B[] = new int[N*N];
        int count = 0;
        for(int i=0 ; i<N ; i++){       //배열A를 배열B로 옮김
            for(int j=0 ; j<N ; j++){
                count++;
                A[i][j] = count;
                B[count-1] = count;
            }
        }

        Arrays.sort(B); // 배열B 정렬


        for(int i=0 ; i<N ; i++){
            for(int j=0 ; j<N ; j++){
                System.out.println(A[i][j]);
            }
        }
    }
}
