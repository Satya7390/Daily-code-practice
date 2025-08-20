package Arrays;

import java.util.*;

//static void int(int arr[]){
//
//}

public class Arr2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int ele = 3;

		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == ele) {

				count++;
			}
		}

		if (count == 0) {
			System.out.println("Element not present");
		} else {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != ele) {
					System.out.print(" " + a[i]);
				}

			}
		}

	}

}
