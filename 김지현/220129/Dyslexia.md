## Dyslexia

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
      
        String tmp = sc.next();
        String next = sc.next();
        int cnt = 0;
        for(int i=0; i<N; i++){
            if(tmp.charAt(i) != next.charAt(i)){
                cnt +=1;
            }
        }
        System.out.println(cnt);
        
    }
}
```