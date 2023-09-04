class Solution {
    public String solution(int[] food) {
        String answer = "";
        String one_side = "";

        for (int i = 0; i < food.length ; i++) {
            if (food[i] > 1 ) {
                int food_num = food[i]/2;
                String food_type = String.valueOf(i);

                one_side += food_type.repeat(food_num);
            }
        }
        String other_side = new StringBuilder(one_side).reverse().toString();
        answer = one_side + "0" + other_side;
        
        return answer;
    }
}