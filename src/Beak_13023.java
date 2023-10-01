import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Beak_13023 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    static boolean arrive;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arrive = false;
        A = new ArrayList[n];
        visited = new boolean[n];
        for(int i=0 ; i<n ; i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0 ; i<m ; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            A[s].add(e);
            A[e].add(s);
        }
        for(int i=0 ; i<n ; i++){
            DFS(i, 1);
            if(arrive)
                break;
        }
        if(arrive)
            System.out.println("1");
        else
            System.out.println("0");
    }
    public static void DFS(int now, int depth){
        if(depth == 5 || arrive){
            arrive = true;
            return;
        }
        visited[now] = true;
        for(int i : A[now]){ //A[now]배열에서 꺼내서 i에 차례로 대입
            if(!visited[i]){
                DFS(i, depth + 1);
            }
        }
        visited[ now ] = false;
    }
}
