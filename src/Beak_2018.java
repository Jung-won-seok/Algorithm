import java.io.*;
import java.util.Scanner;
public class Beak_2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i]=i+1;}
        int cnt=0;
        for(int j=0;j<N;j++){
            int sum=j;
            for(int k=sum+1;k<=N;k++){
                sum = sum + k;
                if(sum == N){cnt++;}
            }
        }
        System.out.println(cnt);
    }
}
