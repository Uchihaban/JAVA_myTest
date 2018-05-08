package algorithms;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr){
		if(arr==null||arr.length<2){
			return;
		}
		for(int e = arr.length-1;e>0;e--){
			for(int i = 0;i<e;i++){
				if(arr[i]>arr[i+1]){
					swap(arr,i,i+1);
				}
			}
		}
	}
	
	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = arr[i];
		arr[i]  = arr[j];
		arr[j]  = tmp ;
	}
}
