package Program_Practice;

public class Convert_binary_to_decimal {
	
	public static void main(String[] args) {
		System.out.println(convert(11));
	}

	static int convert(int binary){
		
		int decimal = 0;
		int counter = 0;
		
		while(true){
			if(binary==0){
				break;
			}else{
				int temp = binary%10;
				decimal = (int) (decimal + temp* Math.pow(2, counter));
				binary = binary/10;
				counter ++;
			}
		}
		return decimal;
	}
}
