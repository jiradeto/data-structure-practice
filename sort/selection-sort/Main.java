

public class Main {
	public static void main(String[] args) {
		int[] arr = {38, 65, 84, 72, 12, 9};
		int[] result = selectionSort(arr);
		for(int i=0; i < arr.length; i++){
			System.out.println(" >> "+ arr[i]);
		}
	}

	public static int[] selectionSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			int tmp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = tmp;
		}
		return arr;	
	}
}
