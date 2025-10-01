package Arrays;


public class ThreeDArray {

	public static void main(String[] args) {

		FetchEle();
	}

	public static void FetchEle() {
		int a[][][] = { { { 1, 2,3 },
			              { 3, 4,5 } },
				
				        { { 2, 3,6 },
				          { 6, 7,8 } },
				        { { 2, 3,6 },
					          { 6, 7,8 } }
		};

		System.out.println(a[0][1][1]);
		System.out.println(a[0][1][0]);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}

}
