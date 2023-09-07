import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Beak_1427 {
    public static void main(String[] args){
        int max = 0;
        int blank = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String temp = Integer.toString(num);
        int[] A = new int[temp.length()];
        for(int i=0 ; i<temp.length() ; i++){
            A[i] = temp.charAt(i) - '0';
        }
        for(int i=-1 ; i<A.length-1 ; i++){
            for(int j=i+1 ; j<A.length ; j++) {
                if (A[j] > max) {
                    max = A[j];
                    blank = A[i+1];
                    A[i+1] = max;
                    max = blank;
                }
            }
        }
        System.out.println(Arrays.toString(A));
        System.out.println(max);
    }
}
