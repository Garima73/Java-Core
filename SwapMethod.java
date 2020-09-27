package practice;

public class SwapMethod {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("value before swapping: a="+a +" "+"b="+b);
		swapfunction(a,b);
	}
	public static void swapfunction(int a,int b) {
		int c=a;
		a=b;
		b=c;
		System.out.println("value after swapping: a="+a +" "+"b="+b);
		
	}
}
