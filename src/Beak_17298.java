import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Beak_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            A[i] =Integer.parseInt(st.nextToken());
        }
        for(int i=0 ; i<N ; i++){
            int j = i + 1;
            int cnt = i + 1;
            while(j < N){
                if(A[i] < A[j]){
                    System.out.println(A[j]);
                    break;
                }
                else if(A[i] > A[j]){
                    cnt++;
                    j++;
                }
                if(j == N){
                    System.out.println(-1);
                }
            }
            if(i == N-1){
                System.out.print(-1);
            }
        }
    }
}

