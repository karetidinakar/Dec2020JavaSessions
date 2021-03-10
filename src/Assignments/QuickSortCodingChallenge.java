package Assignments;

public class QuickSortCodingChallenge {
	// {7,2,6,5,4}
	// Comparison Index always moves
	// Pivot Index only swaps with Comparison Index and moves when Array[Comparison
	// Index] is less than Pivot Value

	int count = 0;

	void quickSortC(int[] arr, int start, int end) {
		// System.out.println("HereLowHigh" + " " + low+" "+high);
		if (start < end) {
			int pivotIndex = partition(arr, start, end);
			quickSortC(arr, start, pivotIndex - 1);// arr,0,1
			quickSortC(arr, pivotIndex + 1, end);// arr,2,2
		}
	}

	int partition(int[] arr, int start, int end) {
		int PivotIndex = start;// 0
		int PivotValue = arr[end];// 7
		int ComparisonIndex = start;// 1
		//lesser value we push backward by swap
		for (; ComparisonIndex < end; ComparisonIndex++) {
			if (arr[ComparisonIndex] < PivotValue) {// 2 compared to 7

				int temp = arr[ComparisonIndex];
				arr[ComparisonIndex] = arr[PivotIndex];
				arr[PivotIndex] = temp;
				PivotIndex++;
			}
		}
		int temp = arr[end];
		arr[end] = arr[PivotIndex];
		arr[PivotIndex] = temp;
		return PivotIndex;// 1
	}

	static void printArray(int[] arr) {
		for (int value : arr)
			System.out.print(value + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] numbers = { 99, 44, 6, 2, 1, 55, 63, 87, 283, 4, 0, 33, 29, 61, 201 };
		// { 10, 16, 8, 12, 15, 6, 3, 9, 5 };
		// int[] numbers = { 7, 2, 6 };//
		QuickSortCodingChallenge qs = new QuickSortCodingChallenge();
		qs.quickSortC(numbers, 0, numbers.length - 1);
		printArray(numbers);

	}

}
