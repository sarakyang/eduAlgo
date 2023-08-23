class Solution {
    public long solution(int a, int b) {
       
        long answer = 0;
        long max;
        long min;
        // 삼함 연산자  (조건) ? true : false  ==> 조건의 true와 false에 따라 값이다름 
        max = (a>b) ? a : b;
        min = (a<b) ? a : b;

        long result = 0;
        // 작은 수 부터 큰 수 까지 달려감 굿! 
        for(long i=min; i<=max; i++) {
            // 그러면서 다 더함
            result += i;
        }

        answer = result;
        return answer;


    }
}