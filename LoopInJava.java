package practice;
import java.util.Scanner;
//Types of loop:
//1.For loop 2.While loop  3. Do While loop
public class LoopInJava {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n= sc.nextInt();
	int i;
	for(i=0;i<n;i++) {
		System.out.println(i);
	}
	System.out.println("  Next value: ");
	for(i=100;i>n;i--) {
		System.out.println(i);
	}
	}
	}

