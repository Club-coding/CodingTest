import java.util.*;

class Boxer implements Comparable<Boxer>{
    int num;
    double winRate;
    int winMoreWeight;
    int weight;

    Boxer(int n, double wr, int wmw, int w){
        num = n;
        winRate = wr;
        winMoreWeight = wmw;
        weight = w;
    }
    
    // 다시 비교구문을 작성하니 된다. 원래 비교구문이 잘못됐었던 듯
    // 아래와 같이 compare와 if( a != b)와 함께 사용, 같은 경우는 그 다음 비교기준으로 넘기기, 마지막 비교기준에는 if 사용하지 않으므로 1,0,-1을 리턴하기,
    // 코드가 훨씬 간단 명료
    @Override
    public int compareTo(Boxer boxer){
        if(boxer.winRate < this.winRate){
            return -1;
        }else if(boxer.winRate > this.winRate){
            return 1;
        }else{
            if(boxer.winMoreWeight < this.winMoreWeight){
                return -1;
            }else if(boxer.winMoreWeight > this.winMoreWeight){
                return 1;
            }else{
                if(boxer.weight < this.weight){
                    return -1;
                }else if(boxer.weight > this.weight){
                    return 1;
                }else{
                    if(this.num < boxer.num){
                        return -1;
                    }else if(this.num > boxer.num){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }
        }
    }

    // 복서 번호 외 전부 내림차순 정렬 compare사용하는 아래 코드로 변환하니 정답
    /*
    @Override
    public int compareTo(Boxer boxer){
        if (boxer.winRate != this.winRate)
            return Double.compare(boxer.winRate, this.winRate);

        if (boxer.winMoreWeight != this.winMoreWeight)
            return Integer.compare(boxer.winMoreWeight, this.winMoreWeight);

        if (boxer.weight != this.weight)
            return Integer.compare(boxer.weight, this.weight);

        return Integer.compare(this.num, boxer.num);
    }
    */


}


class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        List<Boxer> boxers = new ArrayList<>();

        for(int i = 0; i < weights.length; i++){
            double total = 0;
            double win = 0;
            int winMoreWeight = 0;

            for(int j = 0; j < head2head[i].length(); j++){
                // issue 1. 1 vs 1뿐만 아니라 N은 무승부가 아니라 붙어본적 없음으로 승률에 포함시키면 안됨
                if(head2head[i].charAt(j) != 'N'){
                    total++;
                }

                if(head2head[i].charAt(j) == 'W'){
                    win++;
                    if(weights[i] < weights[j]){
                        winMoreWeight++;
                    }
                }
            }

            double winRate = total == 0 ? 0 : win/total*100;
            boxers.add(new Boxer(i + 1, winRate, winMoreWeight, weights[i]));
        }

        Collections.sort(boxers);

        for(int i = 0; i < boxers.size(); i++){
            answer[i] = boxers.get(i).num;
            Boxer boxer = boxers.get(i);
            System.out.println(boxer.num + " " + boxer.winRate + " " + boxer.winMoreWeight + " " + boxer.weight);
        }

        return answer;
    }
}