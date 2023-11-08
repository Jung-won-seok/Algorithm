import java.io.*;
import java.util.Scanner;

public class Beak_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] A = str.split("-");

        int sum_1 = 0;
        int sum_2 = 0;
        int sum = 0;

        for(int i=0 ; i<1 ; i++){
            String[] B = A[i].split("\\+");
            for(int j=0 ; j<B.length ; j++){
                sum_1 += Integer.parseInt(B[j]);
            }
        }

        for(int i=1 ; i<A.length ; i++){
            String[] B = A[i].split("\\+");
            for(int j=0 ; j<B.length ; j++){
                sum_2 += Integer.parseInt(B[j]);
            }
        }
        sum = -sum_2 + sum_1;
        System.out.println(sum);

    }
}
