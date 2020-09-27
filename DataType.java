package practice;


import java.util.Scanner;

public class DataType {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner sc= new Scanner(System.in);
		char name= sc.next().charAt(0);
		System.out.println("Your name is:"+name);
				
	}

}
