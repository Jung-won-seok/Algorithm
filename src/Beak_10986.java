import java.io.*;
import java.util.Scanner;

public class Beak_10986 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int M = sc.nextInt();
        for(int i=0 ; i<N ; i++){
            A[i] = sc.nextInt();
        }
        int cnt = 0;
        for(int i=0 ; i<N ; i++){
            int sum = 0;
            for(int j=i ; j<N ; j++ ){
                sum = sum + j;
                if(sum % M == 0){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
