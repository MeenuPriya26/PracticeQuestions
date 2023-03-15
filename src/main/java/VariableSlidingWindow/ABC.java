package VariableSlidingWindow;

import java.util.HashMap;

public class ABC {
    public static void main(String[] args) {
        String str="TOTMTAPTAT";
        String pat="TTA";
        findMinWindowSubstring1(str,pat);
    }

    private static String findMinWindowSubstring1(String s, String t) {

        int i=0;
        int j=0;
        String ans="";
        int mx=Integer.MAX_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        char[] x=t.toCharArray();
        char[] ch=s.toCharArray();
        for(int m=0;m<t.length();m++){
            map.put(x[m],map.getOrDefault(x[m],0)+1);
        }
        int count=map.size();


        while(j<s.length()){
            if(!map.containsKey(ch[j])){
                j++;
                continue;
            }
            //if we find the charcter in  the map
            else if(map.containsKey(ch[j])){
                map.put(ch[j],map.get(ch[j])-1);
                if(map.get(ch[j])==0){
                    count--;
                }
            }

            if(count==0){
                if(mx>j-i+1){
                    ans=s.substring(i,j+1);
                    mx=Math.min(mx,j-i+1);

                }

                while(count==0){
                    if(!map.containsKey(ch[i])){
                        i++;
                    }
                    else {
                        map.put(ch[i],map.get(ch[i])+1);
                        if(map.get(ch[i])>0){
                            count++;
                        }
                        i++;
                    }

                    if(count==0){
                        if(mx>j-i+1){
                            ans=s.substring(i,j+1);
                            mx=j-i+1;
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
