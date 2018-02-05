package Program_Practice;

public class Reverse_number {
	
	public static void main(String[] args) {
		
		int number = 1234567891,reverse = 0;
		
		while(number!=0){
			reverse = (reverse*10)+(number%10);
			number = number/10;
		}
		
		System.out.println(reverse);
	}

}
