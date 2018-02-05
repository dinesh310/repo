package Program_Practice;

import java.util.Scanner;

public class Prime_numbers {
	
	public static void main(String[] args) {
		
		//to find the given number is prime number
		//0 and 1 are not prime numbers
		//2 is by default prime number
		
		int number = 5;
		int flag = 0;
		for(int i = 2;i<=number/2;i++){
			if(number%i==0){
				System.out.println("number is not prime");
				flag = 1;
			}
		}
		
		if(flag==0){
			System.out.println("number is prime");
		}
		
		//to print n number of prime numbers
		
		int n = 0;
		int i = 0;
		String prime = "";
		
		System.out.println("Enter the number:");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for( i = 1;i<=n;i++){
			int counter = 0;
			for(int j = i;j>=1;j--){
				if(i%j==0){
					counter = counter + 1;
				}
			}
			
			if(counter ==2){
				prime = prime +i;
			}
		}
		System.out.println(prime);
		
	}

}
