# 분해합 


히히 나혼자 했는데 풀었다 !
자력으로 풀수있다 ! 

```
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer=0;
        int len = String.valueOf(N).length();
        for(int i=1; i<N; i++){
           // System.out.println(i);
            int result = creator(i, String.valueOf(i).length());
            if(result == N){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }

    public static int creator(int num, int len){
        int result = num;
        int l = (int) Math.pow(10,len-1);
        while(l >= 1){
            int x = num / l;
            result += x;
            num %= l;
            l /= 10;
        }
        //System.out.println(result);
        return result;

    }
}
```