## 스피드제한

어의없쏘 bufferedreader자식은 while문 전에 있어야했다!

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            
            int n = Integer.parseInt(br.readLine());
            int T =0;
            long sum =0;
            if(n == -1){
                break;
            }
            else{
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                sum += s*(t-T);
                T = t;


            }

            System.out.println(sum + " miles");

            }
        }

    }   

}
```