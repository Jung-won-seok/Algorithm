import java.io.*;
import java.util.Scanner;

public class Beak_1929 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int size = N-1;
        int B[] = new int[size];
        int first = 2;
        for(int i=0 ; i<size ; i++){
            B[i] = first++;
        }

        for(int i=0 ; i<B.length ; i++){
            for(int j=i+1 ; j<B.length ; j++){
                if(B[i] == 0){
                    break;
                }else if(B[j] % B[i] == 0){
                    B[j] = 0;
                }
            }
        }

        for(int i=0 ; i<size ; i++){
            if(B[i]!=0 && B[i]>=M){
                System.out.println(B[i]);
            }
        }

    }
}
