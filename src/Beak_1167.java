import java.io.*;
import java.util.*;

public class Beak_1167 {
    static boolean visited[];
    static int[] distance;
    static ArrayList<Edge>[] A;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        A = new ArrayList[n+1];
        for(int i=1 ; i<=n ; i++){
            A[i] = new ArrayList< Edge>();
        }
        for(int i=0 ; i<n ; i++){
            int S = sc.nextInt();
            while(true){
                int E = sc.nextInt();
                if(E == -1)
                    break;
                int V = sc.nextInt();
                A[S].add(new Edge(E,V));
            }
        }
        distance = new int[n+1];
        visited = new boolean[n+1];
        BFS(1);
        int MAX = 1;
        for(int i=2 ; i<=n ; i++){
            if(distance[MAX] < distance[i])
                MAX = i;
            }
        distance = new int[n+1];
        visited = new boolean[n+1];
        BFS(MAX);
        Arrays.sort(distance);
        System.out.println(distance[n]);
        }
        private static void BFS(int index){
            Queue<Integer>queue = new LinkedList<Integer>();
            queue.add(index);
            visited[index] = true;
            while(!queue.isEmpty()){
                int now_node = queue.poll();
                for(Edge i : A[now_node]){
                    int e = i.e;
                    int v = i.value;
                            if(!visited[e]){
                                visited[e] = true;
                                queue.add(e);
                                distance[e] = distance[now_node] + v;
                            }
                          }
                        }
                      }
                    }
   class Edge{
    int e;
    int value;
    public Edge(int e, int value){
        this.e = e;
        this.value = value;
    }
}
