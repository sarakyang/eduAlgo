class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // 빼야할 값을 저장하는 장소 편의상 만듬 
        int b = 0;
        //약수의 갯수가 홀 수 라면, 그 수는 제곱수 때문에 제곱수를 찾는 수 
        //또한 제곱근의 깂이기 때문에 제곱수가 아니라면 그 값의 손실이 생기기 때문에 
        // int로 변환 후 다시 제곱하면 손실이 생겨 i와 같은 수 없음
        for (int i = left ; i <= right ; i++) {
            if((int)Math.sqrt(i)*(int)Math.sqrt(i) == i ){
                b += i;
            } else answer += i;
        }
        
        answer -= b;
        return answer;
    }
}