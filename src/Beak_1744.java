import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Beak_1744 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> plus_q = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minus_q = new PriorityQueue<>();
        int N = sc.nextInt();
        for(int i=0 ; i<N ; i++){
            int A = sc.nextInt();
            if(A > 0){
                plus_q.add(A);
            }else{
                minus_q.add(A);
            }
        }
        int sum = 0;
        while(plus_q.size() > 1){
            int first = plus_q.poll();
            int second = plus_q.poll();
            if(first == 1 || second == 1){
                sum = sum + first + second;
            }else {
                sum = sum + (first * second);
            } //sum = sum + Math.Max;
        }
        if(!plus_q.isEmpty()){
            sum = sum + plus_q.poll();
        }
        while(minus_q.size() > 1){
            int first = minus_q.poll();
            int second = minus_q.poll();
            sum = sum + (first*second);
        }
        if(!minus_q.isEmpty()){
            sum = sum + minus_q.poll();
        }
        System.out.println(sum);
    }
}



