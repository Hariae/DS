package ArraysPartII;

public class LargerHalfIntegralAverage {
	int largerHalfIntegralAvg(int arr[]) {
	    // TODO:  Return Index of unique element
		int mid=arr.length/2;
		int sum = 0;
		for(int i=0;i<mid;i++) {
			sum += arr[i];
		}
		int firstAve = sum / mid;
		
		sum =0;
		for(int i=mid;i<arr.length;i++) {
			sum += arr[i];
		}
		
		int secAve = sum / (arr.length-mid);
		
		System.out.println(firstAve + " " + secAve);
		return firstAve > secAve ? firstAve : secAve ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargerHalfIntegralAverage obj = new LargerHalfIntegralAverage();
		int[] arr = {2, 2, 4, 4}; 
		System.out.println(obj.largerHalfIntegralAvg(arr));

	}

}
