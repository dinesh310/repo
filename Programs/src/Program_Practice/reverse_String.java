package Program_Practice;

public class reverse_String {
	
	public static void main(String[] args) {
		
		//without using recursion function
		String s = "Dinesh";
		
		char[] c = s.toCharArray();
		int i = c.length;
		while(i>0){
			System.out.println(c[i-1]);
			i--;
		}
		
		//using recursive function
		
		String rev = recursive("Dinesh");
		System.out.println(rev);
	}
	
	static String recursive(String substring){
		
		String s = substring;
		String reverse = ""; 
		if(s.length()>=1){
			char c = s.charAt(0);
			reverse = recursive(s.substring(1));
			reverse = reverse+c;
		}
		return reverse;
		
	}

}
