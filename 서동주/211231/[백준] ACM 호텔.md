
> **[[백준] ACM 호텔](https://www.acmicpc.net/problem/10250)**

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
        
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        
        for(int i = 0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int floor = (N%H==0)?H:N%H;
            int room = (int)Math.ceil(((double)N/H));
            
            bw.write(floor*100+room+"\n");
        }

        bw.flush();
        bw.close();
    }
}
```
