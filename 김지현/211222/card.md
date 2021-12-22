# 카드 2

큐를 이용해서 쉽게 풀수 있는 문제였다 !

```
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> card = new LinkedList<>();
        for(int i=0; i<N; i++){
            card.add(i+1);
        }

        while(card.size() > 1){
            card.remove();
            card.offer(card.poll());
        }
        
        System.out.println(card.peek());
        
    }

}

```