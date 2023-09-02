import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {

        ArrayList<Integer> sum = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (!(i == j)) {
                    int a = numbers[i] + numbers[j];
                    sum.add(a);
                }
            }
        }

        Set<Integer> sum_dis = new HashSet<>(sum);
        int[] answer = sum_dis.stream().mapToInt(i -> i).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}