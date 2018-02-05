import java.util.ArrayList;
import java.util.List;


public class reverse_String {

	public static void main(String[] args) {
		
		String s = "Dinesh";
		List<Character> list = new ArrayList<Character>();
		
		char[] c = s.toCharArray();
		
		int len = c.length;
		
		while(len>0){
			 list.add(c[len-1]);
			len--;
		}
		
		System.out.println(list);
		
		for(Character n : list){
			System.out.println(n);
			
		}
	}
}
