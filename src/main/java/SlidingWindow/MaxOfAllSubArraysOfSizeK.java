package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class MaxOfAllSubArraysOfSizeK {
    public static void main(String[] args) {
       // int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] arr = {4,7,8,9,76};
        int N = arr.length;
        int K = 3;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> resultant = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        while (j < N) {

            list.add(arr[j]);
            if (j - i + 1 < K) {
                j++;
            }
            if (j - i + 1 == K) {
                if (list.size() > 0) {
                    for (int m = 0; m < list.size(); m++)
                        max = Math.max(max, list.get(m));
                    resultant.add(max);
                }
                list.remove(0);
                i++;
                j++;
            }
        }
        System.out.println(resultant);
    }
}
