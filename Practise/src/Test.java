

public class Test {
	
	public static void main(String[] args) {
		
		String s = "saggeS!zza^!";
		int counter = 0;
		
		for (int i=0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				if(s.charAt(j)==s.charAt(i)){
					counter++;
				}
			}
			System.out.println(s.charAt(i)+"----"+counter);
//			String d = String.valueOf(s.charAt(i)).trim();
//			s = s.replaceAll(d,"");
//			counter = 0;
//			System.out.println(d);
		}
	}

}
