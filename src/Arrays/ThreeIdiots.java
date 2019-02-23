package Arrays;

public class ThreeIdiots {

	boolean areThreeIdiotsIn(int arr[]) {
	    // TODO:  Your Code Goes Here
		int counter=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]  - arr[i-1] == 1) {
				counter++;
			}
			else {
				counter=0;
			}
			//System.out.println(counter);
			if(counter == 2) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeIdiots obj = new ThreeIdiots();
		
		int[] arr = {1, 2, 4}; 
		System.out.println(obj.areThreeIdiotsIn(arr));

	}

}
