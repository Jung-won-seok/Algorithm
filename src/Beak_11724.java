import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Beak_11724 {
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        A = new ArrayList[n + 1];
        for (int i = 1; i < n+1; i++) {
            A[i] = new ArrayList<Integer>(); //각자 노드의 arraylist 선언
        }
        for (int i = 0; i < m; i++) { //인접list에 넣는 과정 반복 m
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); //방향성이 없으므로 시작점에서 종료점으로 이동 가능
            A[e].add(s); //방향성이 없으므로 종료점에서 시작점으로 이동 가능
        }
        int count = 0;
        for (int i = 1; i < n+1; i++) {
            if (!visited[i]) { //"방문하지 않은 노드이면" 이라는 뜻
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) {
        if (visited[v]) {
            return;
        }
        visited[v] = true;
        for (int i : A[v]) { //현재 노드에서 연결되어 있는 노드를 모두 탐색
            if (!visited[i]) {
                DFS(i); //방문하지 않은 노드가 있다면 자기자신을 다시 구현
            }
        }
    }
}
