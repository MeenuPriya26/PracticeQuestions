package PracticQns;

import java.util.*;

public class PrintDuplicate {
    public static void main(String[] args) {
        int[] arr={12,11,40,12,5,6,5,12,11};
        int[] result=PrintDupArr(arr);
        int[] result1=PrintDupArr1(arr);
    }
    private static int[] PrintDupArr1(int[] arr){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            if (mp.containsKey(arr[i]))
                mp.put(arr[i],mp.get(arr[i])+1);
                else
                    mp.put(arr[i],1);
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>1){
                al.add(entry.getKey());
            }
        }
        int[] result= new int[al.size()];
        for(int i=0;i<result.length;i++){
            result[i]=al.get(i);
            System.out.print(result[i]+" ");
        }
        Object[] objectArray=mp.entrySet().toArray();
        System.out.println("Printing");
        Integer[] key = mp.keySet().toArray(new Integer[0]);
        System.out.println(Arrays.toString(key));

        return result;
    }
    private static int[] PrintDupArr(int[] arr) {
        boolean present=false;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(al.contains(arr[i])){

                        break;
                    }
                    else
                        al.add(arr[i]);
                    present=true;
                }
            }
        }
        if(present==true){
            System.out.print("List is"+al);
            //System.out.println("Hello");
        }
        int[] resultantArr=new int[al.size()];
        for(int i=0;i<al.size();i++){
            resultantArr[i]=al.get(i);
            System.out.print(resultantArr[i]+" ");

        }
        return resultantArr;
    }
}
