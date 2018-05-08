package algorithms;

public class InsertionSort {

	
	public static void insertionSort(int[] arr){
		if(arr == null || arr.length<2){
			return;
		}
		for(int i=1;i<arr.length;i++){
			for(int j=i-1;j>0&&arr[j]<arr[j+1];j++){
				swap(arr,j,j+1);
			}
		}
	}
	
	
	

	private static void swap(int[] arr, int j, int i) {
		// TODO Auto-generated method stub
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
