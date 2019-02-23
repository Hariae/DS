package Arrays;

public class CountNumbersWIthKthBItSet {
	
	int getCountWithKthBitSet(int a[], int k)
	{
		int count=0;
		for(int i=0;i<a.length;i++) {
			a[i] = a[i] >> k-1;
			if((a[i] & 1) == 1) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNumbersWIthKthBItSet obj = new CountNumbersWIthKthBItSet();
		int[] arr= {1, 2, 3, 4};
		System.out.println(obj.getCountWithKthBitSet(arr, 2));
	}

}
