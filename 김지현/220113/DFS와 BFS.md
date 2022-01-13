## DFS와 BFS

BFS는 너비 우선탐색으로 많이 해봤는데
DFS는 좀 헷갈렸다 
예전에 stack으로 했었던것 같아서 해볼려했는데
다른사람들 구현한거 보니까 재귀로 하는것같아서 이렇게 해보았다

```java 
import java.util.*;

public class Main{
    static int[][] arr;
    static boolean[] checked;
    static Queue<Integer> queue;
    static Stack<Integer> stack;
    static int N,M,V;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        M= sc.nextInt();
        V= sc.nextInt();
        arr = new int[1001][1001];
        checked = new boolean[10001];
        queue = new LinkedList<>();
        
        for(int i=0; i<M; i++){
            int x= sc.nextInt();
            int y = sc.nextInt();
            arr[x][y] =arr[y][x] = 1;
        }
        dfs(V);

        checked = new boolean[10001];
        System.out.println("");
        bfs(V);

    }


    public static void dfs(int num){
        checked[num] = true;
        System.out.print(num+ " ");

        for(int i=1; i<=N; i++){
            if(arr[num][i] == 1 && checked[i] == false){
                dfs(i);
            }
        }

    }

    public static void bfs(int num){
            queue.offer(num);
            checked[num] = true;
            System.out.print(num+ " ");
        
            while(!queue.isEmpty()){
                int tmp= queue.poll();

                for(int j=1; j<=N; j++){
                    if(arr[tmp][j] == 1 && checked[j] == false){
                        queue.offer(j);
                        checked[j] = true;
                        System.out.print(j+" ");
                    }
                }
            
            }
        }

}

```