
> **[[백준] K번째 수](https://www.acmicpc.net/problem/11004)**

	그냥 단순 정렬문제라 생각하여 Collections로 정렬해서 된거 같지만
	QuickSort말고 QuickSelection을 사용하는 문제인 것 같다.
	
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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int[] arr = new int[N];
        for(int i = 0; i<N; i++)
            arr.add(Integer.parseInt(st.nextToken()));
        
        Collections.sort(arr);
        
        bw.write(arr.get(K-1)+"");
        bw.flush();
        bw.close();

    }
}

```
