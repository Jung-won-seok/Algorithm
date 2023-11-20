import java.io.*;
import java.util.Scanner;

public class Beak_1929 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int size = N-M+1;
        int A[] = new int[size];
        for(int i=0 ; i<size ; i++){
            A[i] = M++;
        }

        for(int j=0 ; j<size ; j++){
            for(int k=j+1 ; k<size ; k++){
                if(A[k] % A[j] == 0){
                    A[k] = 0;
                }else if(A[j] == 0){
                    continue;
                }
            }
        }
        for(int i=0 ; i<size ; i++){
            System.out.println(A[i]);
        }
    }
}
