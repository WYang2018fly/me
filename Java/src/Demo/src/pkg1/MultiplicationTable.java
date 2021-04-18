package pkg1;

public class MultiplicationTable {

	public static void main(String[] args) {
		String[][] array = new String[9][9];
		for (int i = 0, length1 = array.length; i < length1; i++) {
			System.out.println();
			for (int j = 0, length2 = array[i].length; j < length2; j++) {
				if (i < j)
					break;
				array[i][j] = (i + 1) + "*" + (j + 1) + "=" + (i + 1) * (j + 1);
				System.out.print(array[i][j] + " ");

			}
		}
	}
}
