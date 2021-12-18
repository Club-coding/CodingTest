
## 영화감독숌

내가 생각한 전개방식은 담과 같다
666 -> 1666 -> 2666 -> ... -> 6666 -> 7666

근데 다른 사람들 풀이 보니까 이게 아니라
5666 -> 6660 -> 6661 로 전개해야하는 것이어따 



```
import java.io.*;
import java.util.*;

// 첨에 생각한 부분 :  나누기를 하면서 풀었다 

/*
public class director{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        int q = num / 6;
        int r = num % 6 -1;

        System.out.println(q+" "+r);
        if(q == 0){
            System.out.println(r+"666");
         }else{
            findnum(q);
         }
        
    }

    public static void findnum(int q){
        int mod = 0;
        String x = "";

        while(q > 6){
            mod = q %6;
            q = q/6;
            x += mod;
        }
        x += q;

        System.out.print(x);
        
    }



}
*/


public class director{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int dead = 666;
        int count =1;
        while(count != num){
            dead +=1;
            if(String.valueOf(dead).contains("666")){
                count +=1;
            }
        }
        System.out.println(dead);

    }

}

```