import java.util.*;

class Solution {
     public int solution(int[] nums) {
        int answer = 0;
        int pick = nums.length/2;

        Set<Integer> type = new HashSet<>();
        for (int num : nums) {
            type.add(num);
        }

        if (pick >= type.size()) {
            answer = type.size();
        } else answer = pick;

        return answer;
    }
}