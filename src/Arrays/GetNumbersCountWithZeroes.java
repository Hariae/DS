package Arrays;
import java.util.*;

public class GetNumbersCountWithZeroes {

	public int getZeroNumbers(int[] arr) {
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String inputArr[] = input.split("\\s+");
		int[] inputs = new int[inputArr.length];
		
		for(int i=0;i<inputArr.length;i++) {
			inputs[i] = Integer.parseInt(inputArr[i]);
		}
		GetNumbersCountWithZeroes obj = new GetNumbersCountWithZeroes();
		System.out.println(obj.getZeroNumbers(inputs));
		
		
	}

}
