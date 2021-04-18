package pkg1;

public class Array {
	public static void main(String[] args) {
		int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		System.out.println("original data: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
		int temp;
		for (int i = 0, length = array.length - 1; i < length; i++) {
			for (int j = 0, count = array.length - i - 1; j < count; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("ascending sort: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}
