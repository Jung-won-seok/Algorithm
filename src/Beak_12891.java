import java.io.*;
import java.util.Scanner;
public class Beak_12891 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); //DNA문자열의 길이
        int P = sc.nextInt(); //부분 문자열의 길이
        sc.nextLine();
        String str = sc.nextLine(); //DNA 문자열 입력받음
        String[] A = str.split(""); //입력받아 쪼개서 배열A에 순서대로 대입

        int B[] = new int[4]; //만족해야 하는 ACGT의 개수
        for(int i=0;i<4;i++) {
            B[i] = sc.nextInt(); //ACGT숫자 입력받기
        }
        int cntA = 0;
        int cntC = 0;
        int cntG = 0;
        int cntT = 0;
        int good_num = 0;

        for(int i=0;i<S-P;i++){
            for(int j=i;j<i+P;j++){
                if(A[j].equals("A")){cntA++;}
                if(A[j].equals("C")){cntC++;}
                if(A[j].equals("G")){cntG++;}
                if(A[j].equals("T")){cntT++;}
            }
            if(cntA >= B[0] && cntC >= B[1] && cntG >= B[2] && cntT >= B[3]) {
                good_num++;
            }
                cntA=0; cntC=0; cntG=0; cntT=0;
        }
        System.out.println(good_num);
    }
}
