import java.util.Scanner;
public class Beak_1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0 ; i<N ; i++){
            A[i] = sc.nextInt();
        } //N갯수만큼 행렬 A생성

        int M=0;
        for(int j=0;j<N;j++){
            if(M<A[j]){
                M=A[j];}
        } //최대점수 M 구하기

        int sum = 0;
        for(int k=0;k<N;k++){
            sum += A[k];
        } //B의 합 구하기
        System.out.println(sum*100/M/N);
    }
}
