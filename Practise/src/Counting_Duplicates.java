import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Counting_Duplicates {

	public static void main(String[] args) {
		
		char[] str = new char[]{'S','a','g','g','e','z','z','a','s','1','1','$','$','a'};
		char[] tm = new char[str.length+1];
		int counter = 0;
		
		ArrayList<Character> list = new ArrayList<Character>();
		int len = str.length;
		for( int k =0; k<len; k++){
			tm[k] = Character.toLowerCase(str[k]);
		}
		for (int i=0; i<len;i++){
			for(int j= i+1;j<len; j++){
				if(tm[i]==tm[j]){
					list.add(tm[i]);
				}
			}
		}
		
		System.out.println(list);
		System.out.println(list.get(0));
		
		for(int z=0; z<list.size();z++){
			for (int x=0;x<list.size();x++){
				if(list.get(z) == list.get(x)){
					counter++;
				}
//			char c = list.get(z);
//			if(c == list.get(z)){
//			counter++;
			}
				System.out.println(list.get(z)+"="+counter);
			
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		/*for(Character c : list){
			Integer count = map.get(c);
			
			map.put(c, (count==null)?1:count+1);
		}
		System.out.println(map);*/
		
		for (int i = 0; i<list.size(); i++){
			char c = list.get(i);
			if(map.containsKey(c)){
				int cnt = map.get(c);
				map.put(c, cnt++);
			}else{
				map.put(c,1);
			}
		}
		System.out.println(map);
		
}
}