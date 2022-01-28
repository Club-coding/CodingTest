
> **[[백준] Dyslexia](https://www.acmicpc.net/problem/8371)**


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
        
        int n = Integer.parseInt(br.readLine());
        char[] f = br.readLine().toCharArray();
        char[] s = br.readLine().toCharArray();
        
        int diff = 0;
        for(int i = 0; i<n; i++){
            if(f[i]!=s[i]) diff++;
        }

        bw.write(diff+"");
        bw.flush();
        bw.close();

    }
}

```
