

public class Main {
	
	public static void main(String[] args) {
		int[] arr = {38, 65, 84, 72, 12, 9};
		printArray(arr);
		System.out.println("\n-- sort result --");
		int[] result = bubbleSort(arr);
		printArray(result);
	}

	public static void printArray(int[] arr){
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + " | ");
		}
	}

	public static int[] bubbleSort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++){
			for (int j = 0; j < arr.length - 1 - i; j++){
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;	
	}

	
}
