package practice;
import java.util.Scanner;

public class Methods {
	public static void main(String[] args) {
		System.out.println("Enter the value of first element:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the value of second element:");
		int b=sc.nextInt();
	
		int c=next(a,b);
		System.out.println("The largest value is:"+c);
		
	}
	public static int next(int m1,int m2) {
		int min;
		if(m1>m2) {
			min=m1;
		}
		else {
			min=m2;
		}
		return min;
		
	}
	
}
