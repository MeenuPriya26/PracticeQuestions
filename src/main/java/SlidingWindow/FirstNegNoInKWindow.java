package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegNoInKWindow {

    public static void main(String[] args) {
       // int[] arr={1,-2,-3,-1,-4,5};
        int [] arr = {12,-1,-7,8,-25,30,-18,-28};
        int i=0;
        int j=0;
        int N=arr.length;
        int K=3;
        int low = 0;
        List<Integer> list=new ArrayList<>();
        List<Integer> lowest=new ArrayList<>();

        while(j<N){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1<K){
                j++;
            }
            else if(j-i+1==K){
                if(list.size()==0){
                    System.out.print(0+" ");
                }
                else
                    {
                        System.out.print(list.get(0)+" ");
                        if(list.contains(arr[i])) {
                            list.remove(0);
                        }
                    }

                j++;
                i++;
            }
        }

    }
}
