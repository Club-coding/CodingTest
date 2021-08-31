import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node3 implements Comparable<Node3>{
    int node;
    int weight;

    Node3(int n, int w){
        node = n;
        weight = w;
    }

    public int compareTo(Node3 n){
        if(this.weight < n.weight){
            return -1;
        }
        
        return 1;
    }
}

public class Main {

    private static ArrayList<ArrayList<Node3>> adj = new ArrayList<>();
    private static int n;
    private static int[] distnaces;
    private static final int INF = 100000001;

    public static void dijkstra(int s, int e){
        distnaces[s] = 0;
        PriorityQueue<Node3> pq = new PriorityQueue<>();
        pq.add(new Node3(s, 0));

        while(!pq.isEmpty()){
            Node3 node = pq.poll();
            int now = node.node;
            int weight = node.weight;

            if(distnaces[now] < weight)
                continue;
            
            for(int i = 0; i < adj.get(now).size(); i++){
                int next = adj.get(now).get(i).node;
                int nextWeight = adj.get(now).get(i).weight;

                if(distnaces[next] > distnaces[now] + nextWeight){
                    distnaces[next] = distnaces[now] + nextWeight;
                    pq.add(new Node3(next, distnaces[next]));
                }

            }
            
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        distnaces = new int[n+1];

        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<Node3>());
            distnaces[i] = INF;
        }

        int m = Integer. parseInt(br.readLine());
        StringTokenizer st = null;

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj.get(s).add(new Node3(d, w));
            //adj.get(d).add(new Node(s, w));
        }

        st = new StringTokenizer(br.readLine());
        int ss = Integer.parseInt(st.nextToken());
        int ee = Integer.parseInt(st.nextToken());
        dijkstra(ss, ee);
    
        System.out.println(distnaces[ee]);
    }    
}
