import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[] players, String[] callings) {
Map<String, Integer> grade = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            grade.put(players[i], i);
        }

        for (String calling : callings) {
            int a = grade.get(calling);

            if (a > 0) {
                String player = players[a - 1];
                players[a - 1] = players[a];
                players[a] = player;

                grade.put(players[a - 1], a - 1);
                grade.put(players[a], a);
            }
        }

        return players;
    }
}