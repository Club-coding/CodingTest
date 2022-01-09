## K번쨰수

처음에는 시간초과 나서 -> bufferedreader로 수정 기초 문법때매 헤매다가
담엔 quick select로 풀어야겠다 
```
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
             }
        
        Arrays.sort(arr);
        System.out.println(arr[K-1]);
        
    }
}

```