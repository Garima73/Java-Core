package practice;
import java.util.*;
import java.text.*;
public class dateformating {
	public static void main(String[] args) {
		Date st=new Date();
		SimpleDateFormat gt=new SimpleDateFormat("E yyy.mm.dd at 'hh:mm:ss");
		System.out.println("Current Date: "+gt.format(st));
	}
	

}
