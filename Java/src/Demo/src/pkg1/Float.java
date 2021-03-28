package pkg1;

public class Float {
	public static void main(String[] args) {
		/* 
		 * 1. Java 中 float 有效数字显示的小问题
		 * https://blog.csdn.net/qq_40286307/article/details/106491578
		 * 2. 为何float有效位数为7位？
		 * https://www.cnblogs.com/tsingke/p/10223183.html
		 */
		float num1 = 3.1415926f;
		double num2 = 3.1415926;
		// num1=3.1415925
		System.out.println("num1="+num1);
		// num2=3.1415926
		System.out.println("num2="+num2);
	}
}
