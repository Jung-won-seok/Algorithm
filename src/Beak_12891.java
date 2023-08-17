import java.io.*;
import java.util.Scanner;
public class Beak_12891 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); //DNA문자열의 길이

        String str = sc.nextLine(); //DNA 문자열 입력받음
        String[] A = str.split(""); //입력받아 쪼개서 배열A에 순서대로 대입

        int P = sc.nextInt(); //부분 문자열의 길이

        int B[] = new int[4];
        int cntA = 0;
        int cntC = 0;
        int cntG = 0;
        int cntT = 0;


        for(int i=0;i<4;i++) B[i] = sc.nextInt(); //ACGT숫자 입력받기

        for(int i=0;i<S-P;i++){
            for(int j=i;j<i+P-1;j++){
                if(A[j].equals("A")){cntA++;}
                if(A[j].equals("C")){cntC++;}
                if(A[j].equals("G")){cntG++;}
                if(A[j].equals("T")){cntT++;}
            }
        }
    }
}
