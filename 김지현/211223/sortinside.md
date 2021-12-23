## 소트인사이드

string으로 받아서 ""기준으로 split해서 정렬후
다시 join해서 출력하도록 만들었다 !

```
import java.util.*;

public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String N = sc.next();
       String[] arr = N.split("");
       Arrays.sort(arr, Collections.reverseOrder());
       System.out.println(String.join("", arr));
    }

}

```