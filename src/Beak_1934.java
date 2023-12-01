import java.io.*;
import java.util.Scanner;

public class Beak_1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0 ; i<T ; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = 0;
            int D = 0;
            int result = 0;
            int max = 0;
            C = A % B;
           while(result == 0){
               D = B % C;
               if(D != 0) {
                   result = D;
               }else{
                   max = C;
                   result = 0;
                   break;
               }
               B = C % D;
               if(B != 0) {
                   result = B;
               }else{
                   max = D;
                   result = 0;
                   break;
               }
               C = D % B;
               if(C != 0) {
                   result = C;
               }else{
                   max = B;
                   result = 0;
                   break;
               }
           }
            System.out.println((A*B)/max);
        }
    }
}
