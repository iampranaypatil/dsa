package sorts;
import java.util.Arrays;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {544,21,5,31,55,3,1};
		
		Sorts l1 = new Sorts();
		
		System.out.println(Arrays.toString(arr));
		Arrays.toString(arr);

		System.out.println();
		//l1.bubbleSort(arr);
		//l1.selectionSort(arr);
		//l1.insertionSort(arr);
		l1.quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));

		System.out.println();
	}

}
