
> **[[백준] N과 M (3)](https://www.acmicpc.net/problem/15651)**

	메모리 초과..
	
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    static BufferedReader br;
    static BufferedWriter bw;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] output = new int[N];

        perm(output, 0, N, M);

        System.out.println(sb);
    }
    
    static void perm(int[] output, int depth, int n, int r){
        if (depth == r) {
            for(int i=0; i<r; i++) {
                sb.append(output[i]);
                sb.append(' ');
            }
            sb.append('\n');
            return;
        }
     
        for (int i = 0; i < n; i++) {
            output[depth] = i+1;
            perm(output, depth + 1, n, r);
        }
    }
}

```
