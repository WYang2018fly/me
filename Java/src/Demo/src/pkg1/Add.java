package pkg1;

public class Add {

	public static void main(String[] args) {
		// 自增
//		int num1 = 1, num2, num3;
//		num2 = ++num1; //∵ num1 = num1 + 1; num2 = num1; ∴ num2 = 2;
//		num3 = num1++; //∵ num3 = num1; num1 = num1 + 1; ∴ num3 = 2;
//		System.out.println("num1="+num1+", num2="+num2+", num3="+num3);
//		
//		int x = 4, y = (x++)+5, z = (++x)+5;
//		System.out.println("x="+x+", y="+y+", z="+z);
		
		int num1 = 1, num2 = 1;
		boolean result1 = (3 > 7) & ((num1++) < 2);
		boolean result2 = (3 > 7) && ((num2++) < 2);
		System.out.println("num1="+num1+", result1="+result1);
		System.out.println("num1="+num2+", result2="+result2);
	}

}
