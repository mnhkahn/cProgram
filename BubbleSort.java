class BubbleSort {
	
	public static void BubbleSort(int [] arr) {
		boolean flag;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[i] ^= arr[j];
					arr[j] ^= arr[i];
					arr[i] ^= arr[j];
					
					flag = true;
				}
			}
			
			if (!flag) {
				return ;
			}
		}
	}
	
	public static void main(String argv[]) {
		int arr[] = {5, 4, 6, 2, 3, 9};
		BubbleSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}