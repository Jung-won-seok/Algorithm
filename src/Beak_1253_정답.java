import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beak_1253_정답 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        int Result=0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<N ; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        for(int k=0 ; k<N ; k++){
            int find = A[k];
            int i=0;
            int j = N-1;
            while(i < j){
                if(A[i] + A[j] == find){
                    if(i != k && j != k){
                        Result++;
                        break;
                    } else if(i == k){
                        i++;
                    }else if( j == k){
                        j--;
                    }
                }else if(A[i] + A[j] < find){
                    i++;
                }else {
                    j--;
                }
            }
        }
        System.out.println(Result);
        br.close();
    }
}
