package Program_Practice;

public class binary_number {
	
	public static void main(String[] args) {
		
		//to check the given number is binary or not
		//1000111 
		
		System.out.println("is 10300111  binary : " + binary(10300111));
		
	}

		static boolean binary(int bin){
			
			boolean flag = true;
			while(true){
				if(bin==0){
					break;
				}else{
					int temp = bin%10;
					if(temp>1){
						flag = false;
						break;
					}
					bin = bin/10;
				}
				
			}
				return flag;
		}
}
