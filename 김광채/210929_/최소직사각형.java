/*
import java.util.*;

class Node implements Comparable<Node>{
    int index;
    int value;
    
    Node(int idx, int val){
        index = idx;
        value = val;
    }
    
    @Override
    public int compareTo(Node node){
        return Integer.compare(node.value, this.value);
    }
}

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        // 가로 세로 최대값을 구함
        PriorityQueue<Node> maxRow = new PriorityQueue<>();
        PriorityQueue<Node> maxCol = new PriorityQueue<>();
        for(int i = 0; i < sizes.length; i++){
            maxRow.add(new Node(i, sizes[i][0]));
            maxCol.add(new Node(i, sizes[i][1]));
        }
        
        // 가로 세로 최대값 두 개 중 더 작은 것의 가로 세로를 변경하며 최소값을 찾음
        // 최대값들에서 더 작은 것을 고르는 이유: 가로 세로를 변경해도 최대값보다 항상 작은 값 보장
        if(maxRow.peek().value >= maxCol.peek().value){
            
            // 변경시 다른 값이 자기보다 작아야 의미가 있음
            // 예제 1 같이 60 50은 서로 변경 가능하지만,  서로 바꾸면 오히려 최대값을 높여 가장 작은 지갑 못 만듦.
            while(maxCol.peek().value > sizes[maxCol.peek().index][0]){   
                Node temp = maxCol.poll();
                maxCol.add(new Node(temp.index, sizes[temp.index][0]));
            }
        }else{
            while(maxRow.peek().value > sizes[maxRow.peek().index][1]){   
                Node temp = maxRow.poll();
                maxRow.add(new Node(temp.index, sizes[temp.index][1]));
            }
        }
        
        answer = maxRow.peek().value * maxCol.peek().value;
        
        return answer;
    }
}
*/

class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int[] size : sizes) {
            int paramMax = Math.max(size[0], size[1]);
            int paramMin = Math.min(size[0], size[1]);

            if (paramMax > max) {
                max = paramMax;
            }

            if (paramMin > min) {
                min = paramMin;
            }
        }
        return max * min;
    }
}