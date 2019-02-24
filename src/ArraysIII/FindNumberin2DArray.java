package ArraysIII;

public class FindNumberin2DArray {
	void findNumberInSortedGrid(int arr[][], int key) {
	    // Print i j if key is found
	   // -1 otherwise
	   // Give a newLine after printing the answer
	  int j=arr[0].length-1;
	  for(int i=0;i<arr.length&&j<arr[0].length;) {
		  if(arr[i][j] == key) {
			  System.out.print(i + " " + j);
			  return;
		  }
		  else {
			 // System.out.println(arr[i][j]);
			  if(arr[i][j] > key) {
				  j--;
			  }
			  else {
				  i++;
			  }
		  }
	  }
	  
	  System.out.print("-1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindNumberin2DArray obj = new FindNumberin2DArray();
		int[][] arr = {{1,2,3}, {4,5,6}, {8,9,20}};
		int key = 9;
		obj.findNumberInSortedGrid(arr, key);
		
	}

}
