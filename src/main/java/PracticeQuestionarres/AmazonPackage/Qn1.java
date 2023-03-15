package PracticeQuestionarres.AmazonPackage;

import java.util.HashMap;
import java.util.Map.Entry;

public class Qn1 {
	public static void main(String args[]) {
        String ans=" ";
        String ans1=" ";
HashMap<Character,Integer> map=new HashMap<>();
String inputString="GGGRR";
for(int i=0;i<inputString.length();i++){
    if(map.containsKey(inputString.charAt(i))){
         map.put(inputString.charAt(i),map.get(inputString.charAt(i))+1);
    }
    else{
        map.put(inputString.charAt(i), 1);
    }
}
for(Entry<Character, Integer> mp : map.entrySet()){
    ans+=mp.getValue()+mp.getKey();
	/*
	 * System.out.println(mp.getKey()); System.out.println(mp.getValue());
	 */

    ans1=mp.getValue()+""+mp.getKey();
    System.out.print(ans1);
}
/*
 * System.out.println(ans);
 */    }

}
