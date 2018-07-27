

public class Main {
	public static void main(String[] args) {
		int[] arr = {38, 65, 84, 72, 12, 9};
		printArray(arr);
		System.out.println("\n-- sort result --");
		int[] result = insertionSort(arr);
		printArray(result);
	}

	public static void printArray(int[] arr){
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " | ");
		}
	}

	public static int[] insertionSort(int[] arr){
		for (int i = 1; i < arr.length ; i++){
			int currentNumber = arr[i];
			for (int j = i - 1; j >= 0; j--){
				if(currentNumber < arr[j]){
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;	
	}
}
