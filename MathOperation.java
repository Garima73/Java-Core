package practice;
import java.util.Scanner;

public class MathOperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a= sc.nextInt();
		System.out.println("Enter the second number");
		int b= sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();

		int sum=a+b+c;
		int diff=a-b-c;
		int mul=a*b*c;
		float div=(a/b/c);
		System.out.println("Total Sum is:"+sum);
		System.out.println("Total difference is:"+diff);
		System.out.println("Total product is:"+mul);
		System.out.println("Total division is:"+div);
		
				
	}

}
