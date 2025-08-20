package Arrays;

public class Sorted {

	public static void main(String[] args) {

		int arr[] = { 23, 24, 54, 43, 657, 343, 767, 34, 34, 8, 4, 1 };
		int temp;

//		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

			System.out.print(arr[i] + " ");

		}
//		

	}

}
