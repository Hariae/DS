package recursion;

public class factorial {
	
	public long factorial(int n) {
		if(n == 0 || n == 1) return 1;
		else {
			return n * factorial(n-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial obj = new factorial();
		System.out.println(obj.factorial(8));
	}

}
