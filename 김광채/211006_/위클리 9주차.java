import java.util.*;

class Solution {
    static boolean[] visited;
    
    public int bfs(int start, List<List<Integer>> adj){
        int count = 1;
        
        LinkedList<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        
        while(!q.isEmpty()){
            int n = q.poll();
            
            for(int i = 0; i < adj.get(n).size(); i++){
                int adjNode = adj.get(n).get(i);
                if(!visited[adjNode]){
                    count++;
                    visited[adjNode] = true;
                    q.add(adjNode);
                }
            }
        }
        
        return count;
    }
    
    public int solution(int n, int[][] wires) {
        int answer = 100;
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i <= n; i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < wires.length; i++){
            adj.get(wires[i][0]).add(wires[i][1]);
            adj.get(wires[i][1]).add(wires[i][0]);
        }
        
        
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                /* 동주 아이디어
                visited = new boolean[n+1];
                visited[i] = true;
                int dest = adj.get(i).get(j);
                visited[dest] = true;
                
                answer = Math.min(answer, Math.abs(bfs(i, adj) - bfs(dest, adj)));
                */
                
                
                int start = i;
                
                // 노드 끊기 = 중간에 삭제하고 끊으면 for문 indexOutOfbound
                int end = adj.get(i).remove(j);
                adj.get(end).remove(start);
                
                visited = new boolean[n+1];
                int diff = 0;
                for(int k = 1; k <= n; k++){
                    if(!visited[k]){
                        diff -= bfs(k, adj);
                        diff = Math.abs(diff);
                    }
                }
                
                adj.get(start).add(end);
                adj.get(end).add(start);
                
                answer = Math.min(answer, diff);
                break;
            }
        }
        
        
        return answer;
    }
}