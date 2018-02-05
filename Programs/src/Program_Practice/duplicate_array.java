package Program_Practice;

public class duplicate_array {
	
	public static void main(String[] args) {
		
		int[] array = new int[]{1,2,3,4,2,5,8,9,8};
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]==array[j]){
					System.out.println(array[i]);
				}
			}
		}
	}

}
