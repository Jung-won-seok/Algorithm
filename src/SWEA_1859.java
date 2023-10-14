import java.util.Scanner;

public class SWEA_1859 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a[] = new int[T];
        for(int i=0 ; i<T ; i++){
            a[i] = sc.nextInt();
            int b[] = new int[a[i]];
            int ans = 0;
            int max = 0;
            for(int j=0 ; j<a[i] ; j++){
                b[j] = sc.nextInt();
            }
            for(int k=0 ; k<a[i] ; k--){
                if(b[k] > b[k-1]){
                    max = b[k];
                    ans = b[k] - b[k-1];
                }
            }



        }
    }
}