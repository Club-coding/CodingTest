
## N과 M (3)

N과 M어렵다

```java
import java.util.*;

public class Main{
    static int N;
    static int M;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];

        back(0);
        System.out.print(sb);

    }

    public static void back(int num){
        if(num == M){
            for(int i=0; i<M; i++){
                sb.append(arr[i]+" ");
            }
            sb.append('\n');
            return;
        }

        for(int i=1; i<=N; i++){
            arr[num] = i;
            back(num+1);
        }
        
        

    }

   
}
```