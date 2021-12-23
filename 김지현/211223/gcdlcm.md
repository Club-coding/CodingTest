## 최대공약수와 최소공배수 


파이썬으로 전에 풀었던거 보다 더 시간이 오래걸리는데 왜죵


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int g = gcd(a, b);
        System.out.println(g);
        System.out.println(a*b/g);
    }

    public static int gcd(int a, int b){
        int tmp;
        while(b>0 ){
            tmp = a%b;
            a = b;
            b= tmp;
        }
        return a;
    }
}

```