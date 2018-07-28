

public class Main {
	public static void main(String[] args) {
		int[] arr = {38, 65, 84, 72, 12, 9};
		printArray(arr);
		System.out.println("\n-- sort result --");
		int[] result = quickSort(arr, 0, arr.length - 1);
		printArray(result);
	}
	
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " | ");
		}
	}
   
    public static int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partition(arr, left, right);
            quickSort(arr, left, index - 1);
            quickSort(arr, index + 1, right);
        }
        return arr;
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int pIndex = left;
        for (int i = left; i < right ; i++) {
            if (arr[i] < pivot) {
                int tmp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = tmp;
                pIndex++;
            }
        }
        int tmp = arr[right];
        arr[right] = arr[pIndex];
        arr[pIndex] = tmp;
        return pIndex;
    }


}
