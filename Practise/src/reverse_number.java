
public class reverse_number {

	public static void main(String[] args) {
		
		int number = 12345;
		int rev = 0;
		while(number!=0){
			rev = (rev*10)+ (number%10);
			number = number/10;
		}
		
		System.out.println(rev);
	}
}
