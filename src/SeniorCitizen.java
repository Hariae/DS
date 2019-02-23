import java.util.*;

public class SeniorCitizen {
	
	public void getSeniorCitizenship(char sex, int age) {
		if(sex == 'm') {
			if(age >= 60) System.out.println("Senior Citizen");
			else System.out.println("Not a Senior Citizen");
		}
		
		if(sex == 'f') {
			if(age >= 58) System.out.println("Senior Citizen");
			else System.out.println("Not a Senior Citizen");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeniorCitizen obj = new SeniorCitizen();
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		int t = Integer.parseInt(input);
		
		while(t>0) {
			t--;
			input = sc.nextLine();
			String inputArr[] = input.trim().split("\\s+");
			char sex = inputArr[0].charAt(0);
			//input = sc.nextLine();
			int age = Integer.parseInt(inputArr[1]);
			
			obj.getSeniorCitizenship(sex, age);
		}
	}

}
