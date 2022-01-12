
> **[[백준] DFS와 BFS](https://www.acmicpc.net/problem/1260)**


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    static boolean[] visited;
    static int[][] node;
    static BufferedWriter bw;
    static int N,M,V;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        
        visited = new boolean[N+1];
        
        node = new int[N+1][N+1];
        
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a][b] = 1;
            node[b][a] = 1;
        }
        
        dfs(V);
        bw.write("\n");
        
        visited = new boolean[N+1];
        bfs(V);
        
        bw.flush();
        bw.close();

    }
    
    public static void dfs(int start) throws IOException{
        visited[start] = true;
        bw.write(start+" ");
        
        for(int i = 0; i<=N; i++){
            if(node[start][i]==1 && !visited[i]){
                dfs(i);
            }
        }

    }
    
    public static void bfs(int start) throws IOException{
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int n = q.poll();
            bw.write(n+" ");
            for(int i = 0; i<=N; i++){
                if(node[n][i]==1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
    
    
}

```
