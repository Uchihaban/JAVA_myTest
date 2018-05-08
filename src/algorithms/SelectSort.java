package algorithms;

public class SelectSort {

	public static void selectSort(int[] arr){
		if(arr==null || arr.length<2){
			return;
		}
		for(int i = 0;i<arr.length-1;i++){
			int minx=i;
			for(int j = i+1;j<arr.length;j++){
				minx=arr[j]<arr[minx] ? j : minx;
				}
			swap(arr,i,minx);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = arr[i];
		arr[i]= arr[j];
		arr[j]=tmp;
	}
}
