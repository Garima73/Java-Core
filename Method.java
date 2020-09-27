package practice;
/*
 4 types of method:
 1.no return type no parameter
 2.return type no parameter
 3.no return type with parameter
 4.return type with parameter
 */
public class Method {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int sum=abc(a,b);
		System.out.println(sum);
		
	}
	
	public static  int abc(int a, int b) {
		return a+b;
	}

}
