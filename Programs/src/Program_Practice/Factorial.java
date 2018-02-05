package Program_Practice;

public class Factorial {

	public static void main(String[] args) {
		
		int n = 5;
		
		int fac = fact(n);
		System.out.println(fac);
	}
	
	static int fact(int n){
		int output;
		
		if(n==1){
			return 1;
		}
		output = fact(n-1)*n;
		return output;
	}
}
