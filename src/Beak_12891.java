import java.io.*;
import java.util.Scanner;
public class Beak_12891 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //DNA 문자열의 길이
        int B = sc.nextInt(); //부분 문자열의 길이

        sc.nextLine();
        String str = sc.nextLine();
        String[] DNA = str.split("");

        int answer[] = new int[4];
        for(int i=0 ; i<4 ; i++){
            answer[i] = sc.nextInt();
        }
    }
}
