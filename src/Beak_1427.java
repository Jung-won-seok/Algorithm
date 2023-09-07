import java.io.*;
import java.util.Scanner;

public class Beak_1427 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String temp = Integer.toString(num);
        int[] A = new int[temp.length()];
        for(int i=0 ; i<temp.length() ; i++){
            A[i] = temp.charAt(i) - '0';
        }

    }
}
