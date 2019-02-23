
public class PowerOfTwo {
	
	public boolean isPowerOfTwo(int num) {
		return num != 0 && (num & num-1) == 0;
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PowerOfTwo..");
		PowerOfTwo obj = new PowerOfTwo();
		System.out.println(obj.isPowerOfTwo(0));
		//System.out.println(obj.isPowerOfFour(32));
		
		//System.out.println(true && (1 & 0));
	}

}
