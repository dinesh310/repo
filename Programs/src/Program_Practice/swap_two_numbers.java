package Program_Practice;

public class swap_two_numbers {
	
	public static void main(String[] args) {
		
		//swap two numbers without using third variable;
		
		int a = 10,b = 20;
		
		a= a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a+"\n"+b);
	
		//swap two number using third variable
		
		int x = 50,y = 100, temp = 0;
		
		temp = y;
		y = x;
		x = temp;
		
		System.out.println(x+"\n"+y);
	
	}

}
