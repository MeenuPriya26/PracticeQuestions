package VariableSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithNoRepeatingCharacters {
    public static void main(String[] args) {
        String str="pwwkew";
        int ans=findLongestSubStringWithNoRepeatingCharacters(str);
        System.out.println(ans);
    }

    private static int findLongestSubStringWithNoRepeatingCharacters(String str) {

        int N=str.length();
        int i=0,j=0;
        char[] ch=str.toCharArray();
        int mx=Integer.MIN_VALUE;
        Map<Character,Integer> map=new HashMap<>();
        while(j<N){
            map.put(ch[j],map.getOrDefault(ch[j],0)+1);
            if(j-i+1<map.size()) {
                j++;
            }

            if(j-i+1==map.size()) {
                mx=Math.max(mx,j-i+1);
                j++;
            }
            else if(j - i + 1 > map.size()){
                while( j - i + 1 >map.size()){
                    map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
                    if(map.get(str.charAt(i)) == 0){
                        map.remove(str.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return mx;
        }
    }

