import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    public static boolean[] visited;
    public static int bfs(int v){
        int count = 0;
        visited[v] = true;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);

        while(!q.isEmpty()){
            int node = q.poll();
            count++;
            for(int dest : adj.get(node)){
                if(!visited[dest]){
                    visited[dest] = true;
                    q.add(dest);
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];

        for(int i = 0; i < n + 1; i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < e; i++){
            String[] startAndEnd = br.readLine().split(" ");
            adj.get(Integer.parseInt(startAndEnd[0])).add(Integer.parseInt(startAndEnd[1]));
            adj.get(Integer.parseInt(startAndEnd[1])).add(Integer.parseInt(startAndEnd[0]));
        }

        System.out.println(bfs(1) - 1);
    }
}