import java.io.*;
import java.util.*;

public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P[] = new int[N];
        int A[] = new int[N];
        for(int i=0 ; i<N ; i++){
            P[i] = sc.nextInt();
        }
        for(int i=0 ; i<N ; i++){
            int sum = 0;
            for(int j=0 ; j<=i ; j++){
                sum = sum + P[j];
            }
            A[i] = sum;
        }
        int result = 0;
        for(int i=0 ; i<N ; i++){
            result = result + A[i];
        }
        System.out.println(result);
    }
}