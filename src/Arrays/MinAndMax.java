package Arrays;

public class MinAndMax {
	
	void printMinAndMax(int arr[]) {
	    // TODO:  Your code goes here.
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinAndMax obj = new MinAndMax();
		int[] arr = {-2,11,23, 90, 34, 45, 65}; 
		obj.printMinAndMax(arr);

	}

}
