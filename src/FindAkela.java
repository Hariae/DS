
public class FindAkela {
	
	public int findAkela(int[] arr) {
		int x = 0;
		for(int i=0; i<arr.length; i++) {
			x = x ^ arr[i];
		}
		//System.out.println(x);
		return x;
	}
	
	public char firstNonDuplicateChar(String inputString) {
		/*
		 * int NO_OF_CHARS = 256;
		 * 
		 * // Initialize all characters // as absent. int arr[] = new int[NO_OF_CHARS];
		 * for (int i = 0; i < NO_OF_CHARS; i++) arr[i] = -1;
		 * 
		 * // After below loop, the // value of arr[x] is going // to be index of x if x
		 * // appears only once. Else // the value is going to be // either -1 or -2.
		 * for (int i = 0; i < inputString.length(); i++) { if
		 * (arr[inputString.charAt(i)] == -1) arr[inputString.charAt(i)] = i; else
		 * arr[inputString.charAt(i)] = -2; }
		 * 
		 * int res = Integer.MAX_VALUE; for (int i = 0; i < NO_OF_CHARS; i++)
		 * 
		 * // If this character occurs // only once and appears before // the current
		 * result, then // update the result if (arr[i] == 1) res = Math.min(res,
		 * arr[i]);
		 * 
		 * return res;
		 * 
		 */		//return 'a';
		
		return 'a';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAkela obj = new FindAkela();
		int[] arr = {3,2,2,6,3};
		obj.findAkela(arr);
	}

}
