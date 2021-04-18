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
		float num3 = (float)num2;
		char a = 'a';
		// 如果字面量的值超出数据范围，需要强制进行数据类型转换
		char ch = (char)65536;
		char c = '\u005d';
		String str = "\u005d\u005d";
		float num4 = 100000000L;
		final int d = 1;
//		d = 2;
		System.out.println("num4="+num4); 
		// num1=3.1415925
		System.out.println("num1="+num1);
		// num2=3.1415926
		System.out.println("num2="+num2);
		System.out.println("num3="+num3);
		System.out.println("a="+a);
		System.out.println("ch="+ch);
		System.out.println("c="+c);
		System.out.println("str="+str);
	}
}
