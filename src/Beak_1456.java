import java.io.*;
import java.util.Scanner;

public class Beak_1456 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //2
        int B = sc.nextInt(); //5
        int size = B-A+1; //2, 3, 4, 5 (4개)
        int num[] = new int[size];
        for(int i=0 ; i<size ; i++){
            num[i] = A++;
        }

        for(int j=0 ; j<size ; j++){
            for(int k=j+1 ; k<size ; k++){
                if(num[k] % num[j] == 0){
                    num[k] = 0;
                }else if(num[j] == 0){
                    continue;
                }
            }
        }
        int cnt = 0;
        for(int j=0 ; j<num.length ; j++){
            for(int k=0 ; k<B ; k++){
                if(Math.pow(num[j],k) <= B) {
                    cnt++;
                }else if(Math.pow(num[j],k) > B){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
