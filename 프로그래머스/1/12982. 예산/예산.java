import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum= 0;

        List<Integer> integerList = new ArrayList<>();
        for (int i : d) {
            integerList.add(i);
        }
        Collections.sort(integerList);

        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
            answer++;
            if (sum > budget) {
                answer--;
                break;
            } else if (sum == budget) {
                break;
            }
        }

        return answer;
    }
}