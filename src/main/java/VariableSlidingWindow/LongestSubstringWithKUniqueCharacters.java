package VariableSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacters {
    public static void main(String[] args) {
        String input="AABBBCC";
       findLongestSubstringWithKUniqueChars(input);
    }

    private static int findLongestSubstringWithKUniqueChars(String input) {
        char[] ch=input.toCharArray();
        int i=0,j=0,mx=Integer.MIN_VALUE;
        int K=3;
        int N=input.length();
        Map<Character,Integer> map=new HashMap<>();


    while(j<N){
        map.put(ch[j],map.getOrDefault(ch[j],0)+1);
       if(map.size()<K)
           j++;
       else if(map.size()==K){
           mx=Math.max(mx,j-i+1);
           j++;
       }
       else if(map.size()>K){
           while(map.size()>K){
               map.put(ch[i],map.get(ch[i])-1);
               if(map.get(ch[i])==0) {
                   map.remove(ch[i]);
               }
               i++;
           }
           j++;
       }
    }
        System.out.println(mx);
    return mx;

    }
}
