import java.util.Arrays;
import java.util.Scanner;

public class Beak_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A); //정렬
        int M = sc.nextInt();
        int find[] = new int[M]; //찾아야할 수
        int Answer[] = new int[M]; //1, 0을 출력
        for (int i = 0; i < M; i++) {
            find[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            int start = 0;
            int end = A.length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (find[i] > A[mid]) {
                    start = mid + 1;
                } else if (find[i] < A[mid]) {
                    end = mid - 1;
                } else {
                    Answer[i] = (find [i] == A[mid]) ?1 : 0;
                    break;
                }
            }
        }
        for (int j = 0; j < M; j++) {
            System.out.println(Answer[j]);
        }
    }
}
