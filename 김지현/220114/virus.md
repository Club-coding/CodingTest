## 바이러스

우앙 이제 bfs가 좀더 쉬워진 느낌

```java
import java.util.*;
public class Main{
    static int[][] computer;
    static boolean[] visited;
    static int N, E, cnt;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt(); // 컴퓨터의 수
        E= sc.nextInt(); // 간선의 수 
        computer = new int[N+1][N+1];
        visited = new boolean[N+1];
        
        for(int i=0; i<E; i++){
            int x = sc.nextInt();
            int y= sc.nextInt();
            computer[x][y] = computer[y][x] = 1;
        }

        bfs(1);
        System.out.println(cnt);
        
    }

    public static void bfs(int num){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(num);
        visited[num] = true;
        cnt = 0;


        while(!queue.isEmpty()){
            int tmp = queue.poll();
            
            for(int i=1; i<=N; i++){
                if(computer[tmp][i] == 1 && visited[i] == false){
                    queue.offer(i);
                    visited[i] = true;
                    cnt += 1;
                }
            }

        }
    }
}
```