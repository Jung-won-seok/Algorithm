import java.io.*;
import java.util.Scanner;

public class Beak_11047 {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];
        int cnt = 0;
        for(int i=0 ; i<N ; i++){
            A[i] = sc.nextInt();
        }

        for(int j=N-1 ; j>=0 ; j--){
            if(K / A[j] != 0){
                cnt = cnt + (K / A[j]);
                K = (K % A[j]);
            }
        }
        System.out.println(cnt);

    }
}
