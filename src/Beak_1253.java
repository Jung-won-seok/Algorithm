import java.io.*;
import java.util.Scanner;
public class Beak_1253 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int sum=0; int cnt=0;
        for(int i=0;i<=N-1;i++){
            int a = i;
            int b = i+1;

            while(b<N-1){
                sum = A[a] + A[b];{
                    while(b<N-1){
                        int c = b+1;
                        if(sum == A[c]){
                            cnt++; break;
                        }
                        else if(sum >= A[c]){
                            c++;
                            continue;
                        }
                        b++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
