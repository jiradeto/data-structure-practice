

public class Main {
	public static void main(String[] args) {
		int[] arr = {38, 65, 84, 72, 12, 9};
		printArray(arr);
		System.out.println("\n-- sort result --");
		int[] result = mergesort(arr, 0, arr.length - 1);
		printArray(result);
	}
	
	
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
		}
	}

    public static int[] mergesort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergesort(arr, left, middle);
            mergesort(arr, middle + 1, right);
            merge(arr, middle, left, right);
        }
        return arr;
    }

    public static void merge(int[] arr, int middle, int left, int right) {

        int[] L = new int[middle - left + 1];
        int[] R = new int[right - middle];

        for (int i = 0; i < L.length; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < R.length; j++)
            R[j] = arr[middle + 1 + j];

        int i = 0;
        int j = 0;
        int k = left;
        while (i < L.length && j < R.length) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < L.length) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < R.length) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

}
