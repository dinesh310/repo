package Program_Practice;

import java.util.HashMap;
import java.util.Scanner;

public class pratise_test {
	
	public static void main(String[] args) {
		
		//factorial
		
		int fact = 5;
		
		System.out.println(fac(fact));
		
	}
	
	static int fac(int num){
	
	if(num ==1){
		return 1;
	}else	
		return fac(num-1)*num;
	
}
}
	