package Arrays;

public class Arrays {

	public static void main(String[] args) {

		int arr[] = { 23, 24, 54, 43, 657, 343, 767, 34, 34, 8, 4, 1 };

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
//			System.out.print(arr[i] + " ");
			
		}
		System.out.print("Maximum is: " + max);
	}

}
