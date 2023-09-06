import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> honor = new ArrayList<Integer>();

        for (int i = 0; i < score.length; i++) {

            honor.add(score[i]);
            Collections.sort(honor,Collections.reverseOrder());

            if(i>k-1 ) honor.remove(k);

            answer[i] = honor.get(honor.size()-1);

        }

        System.out.println(Arrays.toString(answer));
        
        return answer;
        
        
    }
}