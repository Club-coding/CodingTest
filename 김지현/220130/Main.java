import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class Main{
    static int[] dx = {1,0};
    static int[] dy = {0,1};
    static int[][] arr;
    static long [][] visited;
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        visited = new long[N][N];
        
        for(long[] col : visited){
            Arrays.fill(col, -1);
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(dfs(0,0));


        

    }

    public static long dfs(int x, int y){
        if(x == N-1 && y == N-1){
            return 1;
        }

        if(visited[x][y] == -1){
            visited[x][y] = 0;
            for(int i=0; i<2; i++){
                int nx = x + arr[x][y] *dx[i];
                int ny = y + arr[x][y] * dy[i];

                if( 0 <= nx && 0<= ny && nx <N && ny <N){
                    visited[x][y] += dfs(nx, ny);
                }
            }
        }
        return visited[x][y];
    }
}