import java.util.Scanner;
public class Beak_11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N+1];
        A[0]=0;
        for(int i=1;i<=N;i++){
            A[i]=A[i-1]+sc.nextInt();
        }

        for(int j=0;j<M;j++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(A[b]-A[a-1]);
        }
    }
}
