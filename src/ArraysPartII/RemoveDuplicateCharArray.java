package ArraysPartII;

public class RemoveDuplicateCharArray {
	int removeDupChars(char arr[]) {
		
	    // Your Logic Here
		int[] counterArr = new int[26];
		int inc = 1;
		for(int i=0;i<arr.length;i++) {
		//	System.out.print(arr[i]);
			if(counterArr[arr[i]-'a'] == 0) {
				counterArr[arr[i]-'a'] = inc;
				inc++;
				}
		}
		//for(int i=0;i<counterArr.length;i++) { System.out.println(counterArr[i]); }
		
		int counter = 0;
		//char[] res = new char[arr.length];
		for(int i=0;i<26;i++) {
			if(counterArr[i] != 0) {
				counter++;
				arr[counterArr[i]-1] = (char)(i + 'a'); 
			}
		} 
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		/*
		 * for(int i=0;i<counter;i++) { System.out.println(arr[i]); }
		 */
		
		
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateCharArray obj = new RemoveDuplicateCharArray();
		char[] arr = {'a', 'p', 'p', 'l', 'e'};
		
		System.out.println(obj.removeDupChars(arr));
		
	}

}
