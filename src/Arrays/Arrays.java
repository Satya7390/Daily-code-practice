package Arrays;

public class Arrays {

	public static void main(String[] args) {  
		

		int arr[] = { 23, 24, 54, 43, 657, 343, 767, 34, 34, 8, 4, 1 };
		int arr3[] = {};

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
//			System.out.print(arr[i] + " ");

		}
//		System.out.println("Maximum is: " + max);
		
		System.out.println("Maximum is: " + arr3[max]);

		// Reverse order

		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = arr2.length - 1; i >= 0; i--) {

			System.out.print(arr2[i] + " ");

		}
	}

}
