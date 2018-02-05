package Program_Practice;

import java.util.HashMap;

public class Occurance_each_character_String {
	
	public static void main(String[] args) {
		
		String s = "abhagbbwa";
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		char[] c = s.toCharArray();
		
		for(int i = 0; i<s.length();i++){
			
			if(hmap.containsKey(c[i])){
				hmap.put(c[i], hmap.get(c[i])+1);
			}else{
				hmap.put(c[i], 1);
			}
		}
		System.out.println(hmap);
		
	}

}
