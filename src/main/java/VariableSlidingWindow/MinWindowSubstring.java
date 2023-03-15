package VariableSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring {
    public static void main(String[] args) {
        String str="TOTMTAPTAT";
        String pat="TTA";
        findMinWindowSubstring(str,pat);
    }

    private static String findMinWindowSubstring(String str, String pat) {
        String ans="";
        int i = 0, j = 0, N = str.length();
        int mx = Integer.MAX_VALUE;
        char[] ch = str.toCharArray();
        char[] ch1=pat.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int z = 0; z < pat.length(); z++) {
            map.put(ch1[z], map.getOrDefault(ch1[z], 0) + 1);
        }
        int count = map.size();
        while (j < N) {
            if (map.containsKey(ch[j])){
                map.put(ch[j], map.get(ch[j]) - 1);
            if (map.get(ch[j]) == 0) {
                count--;
            }
            }

            if (count == 0) {
                if (mx > j - i + 1) {
                    ans = str.substring(i, j + 1);
                    mx = Math.min(mx, j - i + 1);
                }
                while (count == 0) {
                    if (!map.containsKey(ch[i])) {
                        i++;
                    } else {
                        map.put(ch[i], map.get(ch[i]) + 1);
                        if (map.get(ch[i]) > 0) {
                            count++;
                        }
                        i++;
                    }

                    if (count == 0) {
                        if (mx > j - i + 1) {
                            ans = str.substring(i, j + 1);
                            mx = j - i + 1;
                        }
                    }
                }
            }
            j++;
        }
        System.out.println(ans);

        return ans;
    }
}
