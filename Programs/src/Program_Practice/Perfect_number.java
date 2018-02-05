package Program_Practice;

public class Perfect_number {
	
	public static void main(String[] args) {
		
		//find a perfect number
		//perfect number is equivalent half of the total sum example - 6 = 1,2,3 = 1+2+3+6/2 = 6
		
		int number = 28;
		int temp = 0;
		
		for(int i=1;i<=number/2;i++){
			if(number%i==0){
				temp = temp+i;
			}
		}
		
		if( temp == number){
			System.out.println("number is perfect");
		}else{
			System.out.println("number is not perfect");
		}
		
	}

}
