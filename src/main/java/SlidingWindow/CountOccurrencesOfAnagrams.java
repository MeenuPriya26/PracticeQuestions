package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrencesOfAnagrams{
        public static void main(String[] args) {
            // String input = "forxxorfxdofr";
            String input = "aabaabaa";
            String pattern = "aaba";
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0) + 1);
            }

            int i = 0, j = 0, K = pattern.length();
            int count = map.size(), result = 0;

            while (j < input.length()) {
                if (map.containsKey(input.charAt(j)))
                    map.put(input.charAt(j), map.get(input.charAt(j)) - 1);
                if (map.get(input.charAt(j)) == 0)
                    count--;

                if (j - i + 1 < K) {
                    j++;
                } else if (j - i + 1 == K) {

                    if (count == 0)
                        result++;

                    if (map.containsKey(input.charAt(i)))
                        map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
                    if (map.get(input.charAt(i)) == 1)
                        count++;

                    i++;
                    j++;
                }

            }
            System.out.println(result);
        }
}

