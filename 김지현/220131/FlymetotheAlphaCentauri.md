## Fly me to the Alpha Centauri

```java
import java.util.Scanner;
public class Main{
    static int[] dx = {1, 0,-1};
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int x = sc.nextInt();
            int y = sc.nextInt(); 

            // y-x 이동거리 횟수
            // 1    1        1
            // 2     11   2 ㅎ

            long n = (long) Math.round(Math.sqrt(y-x));

            if(y-x <=n*n ) System.out.println(2*n-1);
            else System.out.println(2*n);

            T--;
        }
    }

    
}
```