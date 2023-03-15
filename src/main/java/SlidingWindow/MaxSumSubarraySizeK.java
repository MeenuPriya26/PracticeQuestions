package SlidingWindow;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {
       // int[] arr = {7, 12, 8, 2, 4, 5, 9, 1, 6, 5, 10};
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};

        // int[] arr = {7, 12, 8, 2, 4};

        int K = 4;
        int N = arr.length;
        int mx = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < N) {
            sum += arr[j];
            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                mx = Math.max(mx, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        System.out.println(mx);
    }
}
