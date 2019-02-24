package ArraysIII;

public class TwoNonRepearingIntegers {
	void printTwoNRIntegers(int arr[]) {
	    
		int xor = 0;
		for(int i=0;i<arr.length;i++) {
			xor = xor ^ arr[i];
	    }
		
		int mask = xor & ~(xor-1);
		int n1=0; int n2=0;
		for(int i=0;i<arr.length;i++) {
			if((mask & arr[i]) == 0) {
				n1 = n1 ^ arr[i];
			}
			else {
				n2 = n2 ^ arr[i];
			}
		}
		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		System.out.println(n1 + " " + n2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoNonRepearingIntegers obj = new TwoNonRepearingIntegers();
		int[] arr = {2 ,3 ,7 ,11, 2 ,6 ,3 ,11};
		obj.printTwoNRIntegers(arr);
	}

}
