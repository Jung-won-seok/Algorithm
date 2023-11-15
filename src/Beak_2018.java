import java.io.*;
import java.util.Scanner;
public class Beak_2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1;
        int left = 1;
        int right = 1;
        int sum = 1;

        while(right != N){
            if(sum == N){
                count++;
                right++;
                sum = sum + right;
            }else if(sum > N){
                sum = sum - left;
                left++;
            }else{
                right++;
                sum = sum + right;
            }
        }
        System.out.println(count);
    }
}
