import java.io.*;
import java.util.Scanner;

public class Beak_2343 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int class_length[] = new int[N];
        int start = 0;
        int end = 0;
        for(int i=0 ; i<N ; i++){
            class_length[i] = sc.nextInt();
            if(start<class_length[i])start = class_length[i];
            end = end + class_length[i];
        }
        while(start <= end){
            int middle = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for(int i=0 ; i<N ; i++){
                if(sum + class_length[i] > middle){
                    count++;
                    sum = 0;
                }
                sum = sum + class_length[i];
            }
            if(sum != 0)
                count++;
            if(count > M)
                start = middle + 1;
            else
                end = middle - 1;
        }
        System.out.println(start);
    }
}
