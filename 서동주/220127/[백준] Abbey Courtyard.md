
> **[[백준] Abbey Courtyard](https://www.acmicpc.net/problem/15610)**


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
 
        double N = Math.sqrt(Long.parseLong(br.readLine()))*4;
        
        bw.write(N+"");
        bw.flush();
        bw.close();
    }
}
```
