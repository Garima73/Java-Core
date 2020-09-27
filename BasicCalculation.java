package practice;
import java.util.Scanner;
// pi,radius

public class BasicCalculation {
	public static void main(String[] args) {
		System.out.println("Enter the radius of the circle:");
		Scanner sc=new Scanner(System.in);
		float radius=sc.nextFloat();
		float area, pi=3.14f;
		area=(pi*radius*radius);
		System.out.println("Area of the circle is:"+area);
		
		
	}
}
