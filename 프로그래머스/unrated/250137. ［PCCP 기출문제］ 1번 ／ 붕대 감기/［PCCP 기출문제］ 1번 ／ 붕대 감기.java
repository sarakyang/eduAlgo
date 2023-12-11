import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {

        int health_now = health;
        int success = 0;
        int time = attacks[attacks.length-1][0];
        int t = 0;

        Map<Integer, Integer> damage = new HashMap<>();
        for (int[] attack : attacks) {
            damage.put(attack[0],attack[1]);
        }

        while (t <= time) {
            if (damage.containsKey(t)) {
                health_now -= damage.get(t);
                success = 0;
                t++;
                if (health_now <= 0) {
                    health_now = -1;
                    break;
                }
                continue;
            }

            health_now+= bandage[1];
            success++;
            if (success == bandage[0]) {
                health_now += bandage[2];
                success = 0;
            }
            if (health_now >= health) health_now = health;

            t++;
        }

        return health_now;
    }
}
