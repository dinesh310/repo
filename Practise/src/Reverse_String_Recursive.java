
public class Reverse_String_Recursive {

	
	public static String reverse(String s){
		
		String rev = "";
		if(s.length()>=1){
			char c = s.charAt(0);
			rev = reverse(s.substring(1));
			rev = rev + c;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		
		String demo = reverse("Dinesh");
		System.out.println(demo);
	}
}
