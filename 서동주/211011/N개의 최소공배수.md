> **[N개의 최소공배수](https://programmers.co.kr/learn/courses/30/lessons/12953)**

```java
class Solution {
    public int solution(int[] arr) {
        int gcd_f = arr[0], lcm = arr[0];
        
        for(int i = 1; i<arr.length; i++){
            gcd_f = gcd(lcm, arr[i]);
            lcm = lcm*arr[i]/gcd_f; //두 자연수의 곱 / 최대공약수
        }

        return lcm;
    }
    
    public static int gcd(int a, int b) {
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
}
```

