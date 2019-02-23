package Arrays;
import java.util.*;

public class SecondHighest {

	void printSecondHighest(int a[])
	{
	    int max = Integer.MIN_VALUE; int sMax = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
	    	
			if(a[i] > max) {
				sMax = max;
				max = a[i];
			}
			else if(a[i] > sMax){
				sMax = a[i];
			}
	    }
		System.out.print(sMax);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondHighest obj = new SecondHighest();
		int[] arr = {-2,11,23, 90, 34, 45, 65}; 
		obj.printSecondHighest(arr);
	}

}
