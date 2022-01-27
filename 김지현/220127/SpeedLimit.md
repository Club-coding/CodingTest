## 스피드제한

아니 왜 다맞는딩,,,NumberFormat Error가 뜨는 이유 아시눈분?

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{

        while(true){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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