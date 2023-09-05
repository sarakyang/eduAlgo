class Solution {
        public int solution(int a, int b, int n) {
        int answer = 0;

        while (true) {
            int coke = 0;
            int coke_min = 0;

            coke =  (n / a) *b;
            coke_min = n % a;

            answer +=coke;

            n = coke_min + coke;

            if (n < a) break;
        }
        return answer;
    }

}