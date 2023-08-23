class Solution {
    public String solution(String s) {
        String answer = "";
        
        int num = 0;

        for (int i = 0 ; i < s.length() ; i++) {
            if (num%2 == 0 )answer += s.substring(i,i+1).toUpperCase();
            else answer += s.substring(i,i+1).toLowerCase();
            num++;
            if (s.substring(i, i + 1).equals(" ")) num = 0;
        }
        return answer;
    }
}