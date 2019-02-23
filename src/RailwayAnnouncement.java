
public class RailwayAnnouncement {
	
	void trainNumberToWords(int N)
    {
         //Your Code Here
		int counter = 0;
		int x = N;
		
		while(x > 0) {
			counter++;
			x/=10;
		}
		x = N;
		
		while(counter > 0) {
			counter--;
			//System.out.println();
			switch(x / (int)Math.pow(10, counter)) {
			case 0 : System.out.println("ZERO"); break;
			case 1 : System.out.println("ONE"); break;
			case 2 : System.out.println("TWO"); break;
			case 3 : System.out.println("THREE"); break;
			case 4 : System.out.println("FOUR"); break;
			case 5 : System.out.println("FIVE"); break;
			case 6 : System.out.println("SIX"); break;
			case 7 : System.out.println("SEVEN"); break;
			case 8 : System.out.println("EIGHT"); break;
			case 9 : System.out.println("NINE"); break;
			
			}
			x = x % (int) Math.pow(10, counter);
			
			
			
		}
		
		//System.out.println(counter);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RailwayAnnouncement obj = new RailwayAnnouncement();
		obj.trainNumberToWords(9080);

	}

}
