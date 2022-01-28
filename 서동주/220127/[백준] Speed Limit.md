
> **[[백준] Speed Limit](https://www.acmicpc.net/problem/4635)**


```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st;
        
        while(true){
           int n = Integer.parseInt(br.readLine());
           if(n==-1) break;
           int prev = 0;
           int mile = 0;
           for(int i = 0; i<n; i++){
               st = new StringTokenizer(br.readLine());
               int s = Integer.parseInt(st.nextToken());
               int t = Integer.parseInt(st.nextToken());
               mile += s*(t-prev);
               prev = t;
           }
           bw.write(mile+" miles\n");
        }
        bw.flush();
        bw.close();

    }
}
```
