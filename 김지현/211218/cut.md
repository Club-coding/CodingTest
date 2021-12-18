## 랜선 자르기 


내가 시도한 풀이
단순하게 모든합으로 나올수있는 최댓값을 구했다


```

import java.util.Scanner;

// public class cut {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();
//         int n = sc.nextInt();

//         Long[] arr = new Long[k];
//         Long sum = 0L;
        
//         for(int i=0; i<k; i++){
//             arr[i] = sc.nextLong();
//             sum += arr[i];
//         }
//         Long min = sum / n;
        
//         int cnt = count(min, arr, n);
//          while(cnt != n){
//             if(cnt < n){
//                  min -=1;
//             }else if(cnt > n){
//                  min +=1;
//              }else{
//                  break;
//              }

//              cnt = count(min, arr, n);
//          }
//         System.out.println(min);
     
//     }

//     public static int count(Long min, Long[] arr, int n){
//         int cnt =0;
//         for (Long number: arr){
//             cnt += number / min;
//         }
//         return cnt;
//     }
    
// }

// 이분탐색법 upper bound
//lower bound 찾고자 하는 값 이상이 처음 나타나는 위치 
//upper bound(상한) 특정값을 초과하는 첫 위치를 반환

// 198 로 자를때의 개수는 11개
// 199 , 200 때도 11개이다

public class cut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[k];
        long max =0;

        for(int i=0; i<k; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];

            }
        }

        max ++;
        long min =0;
        long mid =0;
        while(min < max){
            mid = (max+min)/2;
            long count =0;

            for(int i=0; i<arr.length; i++){
                count += (arr[i]/mid);
            }

            if(count < n){
                max = mid;
            }else{
                min =mid+1;
            }
        }

        System.out.println(min -1);

    }

}

```
-  읭 long이랑 Long이랑 뭐가 다른거지?
부족했던 부분 : 전체합 -> 최소를 찾아서 -1로만 줄이려고 생각했는데
 나올수있는 최대와 최소의 중간값에서 몇개가 나올수있는지 확인하고
이걸 최대길이가 중간값으로 만들어서 다시 mid를 구하는 방법으로 바꾸는 방법을 쓴다 