class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int s= 0;
        // answer 와 s에 둘다 받고 서로 뺌 
        for ( int i = 0; i < absolutes.length ; i++) {
            if (signs[i] == true) {
                answer = answer + absolutes[i];
            } else if (signs[i] == false) {
                s = s + absolutes[i];
            }
        }
        answer = answer - s;
        return answer;
    }
}