package practice;

public class Variable {
	//=====instance variable
	int a=40;
	int b=50;
	
	//====static variable
	public static void main(String[] args) {
		
		Variable v=new Variable();
		System.out.println("Sum:"+(v.a+v.b));
	}
	
	//=====instance block
	public void m1() {//===method define 
	
		System.out.println("sum:"+(a+b));
	}

}
