## AbbyCourtyard 

전체 너비가 구해졌기 때문에
제곱근을 구해서 한곳에 너비를 구하면 되는 문제라 쉬웠다.

```java
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long meter = Long.valueOf(sc.next());
        System.out.println(String.format("%.7f",Math.sqrt(meter)*4));

    }   

}
```