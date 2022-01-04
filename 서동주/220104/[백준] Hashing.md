
> **[[백준] Hashing](https://www.acmicpc.net/problem/15829)**

	* 거듭 제곱과 그 거듭제곱을 곱할 경우 int를 벗어나는 경우가 있음
	* long 자료형으로 초기화 후 1234567891로 둘다 mod 해줌
	
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
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();       
        
        long sum = 0;
        
        for(int i = 0; i<M; i++){
            long pow = 1;
            for(int j = 0; j<i; j++){
                pow*=31;
                pow%=1234567891;
            }
            sum += (S.charAt(i)-'a'+1)*pow;
            sum%=1234567891;
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();

    }
}

```
