package insertionSort;



public class Driver {
	
	public static void main(String args[]) {
		
		int arr[] = { 12, 11, 13, 5, 6 };

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		ob.printArray(arr);
	}
}
