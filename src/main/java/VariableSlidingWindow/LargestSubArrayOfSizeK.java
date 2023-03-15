package VariableSlidingWindow;

public class LargestSubArrayOfSizeK {

    public static void main(String[] args) {
        int arr[]={4,1,1,1,1,1,2};
       int max_len= findLongestSubArrayForLengthK(arr);
        System.out.println(max_len);
    }

    private static int findLongestSubArrayForLengthK(int[] arr){
        int N=arr.length;
        int K=7;//Target Sum
        int i=0,j=0,sum=0;
        int mx=Integer.MIN_VALUE;

        while(j<N){
            sum+=arr[j];
            if(sum<K)
                j++;
            else if (sum==K){
                mx=Math.max(mx,j-i+1);
                j++;
            }
            else if(sum>K){
                while(sum>K){
                    sum-=arr[i];
                    i++;
                }
                j++;
            }
        }
        return mx;
    }
}
