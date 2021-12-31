## ACM 호텔

으앙 쏘 헐드 했는데 왜냐면 헷갈렸다
위로 올라가는때에 height와 똑같을 경우 나머지로 넣으면 0이 들어가기 때문에
X = H;로 해야하지만 내가 풀었을땐 Width를 했을때 경우가 잘못되었다
Y = N/H 로 적었어야했는데 거기에 1작다고 --1 을 해버려서 그부분 수정하고
0을 추가하기보다 *100 하는게 더 나은듯하여 추가하였다 

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            int X = N%H;
            int Y = N/H + 1;

            if(N%H == 0){
                Y = N/H;
                X = H;
            }
            System.out.println(X*100+Y);
        }

       

        
       
        
    }


}

```