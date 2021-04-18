package pkg1;

public class MethodOverload {
	public static void main(String[] args) {
		int a = 10;
		int b = 6;
		double c = 10.00;
		double d = 6.00;
		int result1 = getMin(a, b);

		double result2 = getMin(c, d);
		System.out.println("minimum value = " + result1);
		System.out.println("minimum value = " + result2);
	}

	public static int getMin(int n1, int n2) {
		int min = n1 > n2 ? n2 : n1;
		return min;
	}

	public static double getMin(double n1, double n2) {
		double min = n1 > n2 ? n2 : n1;
		return min;
	}
}
