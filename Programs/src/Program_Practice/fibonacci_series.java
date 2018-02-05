package Program_Practice;

public class fibonacci_series {
	
	public static void main(String[] args) {

		//fibonacci series
		
		int fibo = 5;
		int a = 0,b=0,c=1;
		System.out.println(b);
		System.out.println(c);
		for(int i =0;i<fibo;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}
		
	}

}
