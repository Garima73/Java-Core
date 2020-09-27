package practice;

public class BitwiseOperator {
		public static void main(String[] args) {
			int a=11;
			int b=22;
			int result=0;
			result=a & b; //and operator
			System.out.println("a & b is:"+result);
			result=a | b; // or operator
			System.out.println("a | b is:"+result);
			result= a ;// compliment 
			System.out.println(" ~ a is:"+result);
			result=a ^ b; //X-OR operator
			System.out.println("a ^ b is:"+result);
			result=a << 2; //Left-shift operator
			System.out.println("a << b is:"+result);
			result=a >> 2; //Right-shift operator
			System.out.println("a >> b is:"+result);
			result=a >>> 2; //Right-shift operator
			System.out.println("a >>> b is:"+result);
		}
}
