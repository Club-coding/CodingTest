import java.util.*;

class Node implements Comparable<Node>{
    int city;
    int weight;
    
    Node(int c, int w){
        this.city = c;
        this.weight = w;
    }
    
    @Override
    public int compareTo(Node node) {

        if (this.weight < node.weight)
            return -1;
        else if (this.weight > node.weight)
            return 1;
        return 0;
    }
}

class Solution {
    static int[] distances;
    static ArrayList<ArrayList<Node>> adj = new ArrayList<>();

    public void bfs(int start){
        distances[start] = 0;
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        pq.add(new Node(start, 0));
        
        while(!pq.isEmpty()){
            Node node = pq.poll();
            
            for(int i = 0; i < adj.get(node.city).size(); i++){
                Node next = adj.get(node.city).get(i);
                if( distances[next.city] > distances[node.city] + next.weight){
                    distances[next.city] = distances[node.city] + next.weight;
                    pq.add(next);
                }
            }
            
        }
        
    }
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        distances = new int[N+1];
        
        for(int i = 1; i <= N; i++){
            adj.add(new ArrayList<Node>());
            distances[i] = 5000000;
        }
        adj.add(new ArrayList<Node>());
        
        for(int i = 0; i < road.length; i++){
            
            adj.get(road[i][0]).add(new Node(road[i][1], road[i][2]));
            adj.get(road[i][1]).add(new Node(road[i][0], road[i][2]));
        }
        
        bfs(1);
        
        for(int i = 1; i < distances.length; i++){
            if(K >= distances[i]){
                answer++;
            }
        }

        return answer;
    }
}