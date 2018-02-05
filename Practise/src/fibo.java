
public class fibo {

	
	public static void main(String[] args) {
		
		int a = 0, b= 0, c= 1;
		int fibo = 15;
		System.out.println(b);
		System.out.println(c);
		for(int i=2;i<fibo;i++){
			a=b;
			b=c;
			c = a+ b;
			System.out.println(c);
		}
		
	}
	
}
