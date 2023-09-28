import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Beak_11286 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        int D[] = new int[n];
        int cnt = 0;
        for(int i=0 ; i<n ; i++){
            A[i] = sc.nextInt();
            }
        for(int i=0 ; i<n ; i++){
            if(A[ i ] != 0){
                B[i] = A[i];
            }
            else if(A[i] == 0){
                for(int j=0 ; j<i ; j++){
                    D[j] = B[j];
                }
                for(int k=0 ; k<i ; k++){
                    if(B[k] < 0){
                        B[k] = -2*B[k] + B[k];
                        C[cnt] = k;
                        cnt++;
                    }
                }
                Arrays.sort(B);
                for(int P=0 ; P<cnt ; P++){
                    for(int Q=0 ; Q < i ; Q++){
                        if(D[C[P]] == -B[Q]){
                            B[Q] = -B[Q];
                        }
                    }
                }
            }
            
        }
        }
    }

