package practice;

public class TernaryOperator {
	public static void main(String[] args) {
		int num1,num2;
		num1=25;
		num2=(num1==20)?100:200;
		System.out.println("Value of num2 is:"+num2);
		
		num2=(num1==25)?100:200;
		System.out.println("Value of num2 is:"+num2);
	}

}
