import java.io.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class Beak_1874 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0 ; i<N ; i++){
            A[i] = sc.nextInt(); //만들어야 하는 수 배열입력
        }
        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer(); //내부적으로 공간(buffer)를 만듬
        int num = 1; //오름차순 수
        boolean result = true;
        for(int i=0 ; i<A.length ; i++){
            int su = A[i]; //현재 수열의 수
            if(su >= num){ //현재 수열 값 >= 오름차순 자연수 : 값이 같아질 때까지 push() 수행
                while(su >= num){ //push()
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            }
            else{ //현재 수열 값 < 오름차순 자연수 : pop()을 수행해 수열 원소를 꺼냄
                int n = stack.pop();
                //스택의 가장 위의 수가 만들어야 하는 수열의 수보다 크면 수열을 출력할 수 없음
                if(n>su){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    bf.append("-\n");
                }
            }
        }
        if(result)System.out.println(bf.toString());
    }
}
