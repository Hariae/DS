
public class PowerOfTwo {
	
	public boolean isPowerOfTwo(int n) {
		int x = n;
		while(x>1) {
			if(x%2 == 0) {
				x = x/2; 
			}
			else {
				break;
			}
		}
		
	
		return x == 1?true: false;
	}
	
	public boolean isPowerOfFour(int n) {
		int x = n;
		while(x>1) {
			if(x%4 == 0) {
				x = x/4; 
			}
			else {
				break;
			}
		}
		
	
		return x == 1?true: false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("PowerOfTwo..");
		PowerOfTwo obj = new PowerOfTwo();
		System.out.println(obj.isPowerOfTwo(1024));
		System.out.println(obj.isPowerOfFour(32));
	}

}
