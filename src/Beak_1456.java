import java.io.*;
import java.util.Scanner;

public class Beak_1456 {
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


        int cnt_1=0;
        for(int i=0 ; i<=B.length ; i++){
            if(B[i]!=0 && B[i]>=2){
                cnt_1++;
            }
        }
        int answer[] = new int[cnt_1];
        int a=0;
        for(int i=0 ; i<=N ; i++){
            if(B[i]!=0){
                answer[a] = B[i]; //answer[] -> 소수값을 저장한 배열
                a++;
            }
        }
        int cnt = 0;
        for(int j=0 ; j<cnt_1 ; j++){
            for(int k=0 ; k<N ; k++){
                if(Math.pow(answer[j],k) <= M) { //Math.pow(num[j], k) -> num[j]의 k제곱
                    cnt++;
                }else if(Math.pow(answer[j],k) > M){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
