import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        List<Integer> asc = new ArrayList<>();
        List<Integer> desc = new ArrayList<>();
        
        for(int i = 0; i < A.length; i++){
            asc.add(A[i]);
            desc.add(B[i]);
        }
        
        Collections.sort(asc);
        Collections.sort(desc, Collections.reverseOrder());
        
        for(int i = 0; i < A.length; i++){
            answer += asc.get(i) * desc.get(i);
        }
       

        return answer;
    }
}