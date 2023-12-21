import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion){
    String answer = "";
        Map<String, Integer> goal = new HashMap<>();

        for (String s : participant) {
            int num = 1;
            if (goal.containsKey(s)) {
                goal.replace(s, goal.get(s) + 1);
                continue;
            }
            goal.put(s,num);
        }

        for (String s : completion) {
            goal.replace(s, goal.get(s)-1);
        }

        for (String s : participant) {
            if(goal.get(s) == 1) answer = s;
        }


        return answer;
    }}

