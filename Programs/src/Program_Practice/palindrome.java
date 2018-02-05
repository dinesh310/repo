package Program_Practice;

import java.util.Scanner;

public class palindrome {
	
	public static void main(String[] args) {
		
	
	//to check whether the given string is palindrome or not
	
	String name = "";
	System.out.println("enter the string :");
	Scanner scanner = new Scanner(System.in);
	name = scanner.nextLine();
	
	if(palin(name)){
		System.out.println("String is palindrome");
	}else{
		System.out.println("String is not palindrome");
	}
	
	}
	
	static boolean palin(String s){
		
		if(s.length()==0 || s.length()==1){
			return true;
		}
		
		if(s.charAt(0)==s.charAt(s.length()-1)){
			return palin(s.substring(1,s.length()-1));
		}
		return false;
	}
}
