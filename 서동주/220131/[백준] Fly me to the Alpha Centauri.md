
> **[[백준] Fly me to the Alpha Centauri](https://www.acmicpc.net/problem/1011)**

|y-x|이동 거리|횟수|반복 회수|
|--|--|--|--|
|1  |1  |1  |1   |
|2  |11  |2  |1   |
|3  |111  |3  |   |
|4  |121  |3  |2   |
|5  |1211  |4  |   |
|6  |1221  |4  |2   |
|7  |12211  |5  |   |
|8  |12221  |5  |   |
|9  |12321  |5  | 3  |
|10  |123211  |6  |   |
|11  |123221  |6  |   |
|12  |123321  |6  |3   |
|13  |1233211  |7  |   |
|14  |1233221  |7  |   |
|15  |1233321  |7  |   |
|16  |1234321  |7  |4   |
|17  |1234211  |8  |   |
|18  |1234221  |8  |   |
|19  |12343321  |8  |   |
|20  |12344321  |8  |4   |

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
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            int dist = y - x;
            
            long n = (long)Math.round(Math.sqrt(dist));

            if(dist<=n*n) bw.write(2*n-1+"\n");
            else bw.write(2*n+"\n");
        }

        bw.flush();
        bw.close();
    }
}

```
