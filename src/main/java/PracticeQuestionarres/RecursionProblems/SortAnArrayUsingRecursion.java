package PracticeQuestionarres.RecursionProblems;

public class SortAnArrayUsingRecursion {
public static void main(String[] args) {
	int arr[] = {12, 11, 13, 5, 6};
	int n=arr.length;
	sort(arr,n);
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]);
	}
	
}
static void sort(int[] arr, int n) {
	
	if(n<=1) {
		return ;
	}
	sort(arr,n-1);
	 int last = arr[n-1];
     int j = n-2;
     while (j >= 0 && arr[j] > last)
     {
         arr[j+1] = arr[j];
         j--;
     }
     arr[j+1] = last;
 

}
 static void insert(int[] arr,int temp) {
		/* int j=n-2; */
	int j=arr.length-2;
	while (j >= 0 && arr[j] > temp)
    {
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = temp;
}

}
