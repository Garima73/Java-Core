package practice;

/*Syntax:for(type variable: array){
 * write statement using variables
 * }
 * 
 */
public class ForEachLoop {
	public static void main(String[] args) {
		int[] marks= {70,80,90,99,20,45};
		int highest_marks=maximum(marks);
		System.out.println("This is the highest score:"+highest_marks);
	}
	public static int maximum(int[] numbers) {
		int max_now=numbers[0];
		for(int num:numbers) {
			if(num>max_now) {
				max_now=num;
			}
		}
		return max_now;
	}
}








































