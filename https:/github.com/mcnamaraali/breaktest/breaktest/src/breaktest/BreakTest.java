package breaktest;

public class BreakTest {

	public static void main(String[] args) {
		int count; //declare count control variable
		
		for(count = 1; count <=10; count++) {
			if(count == 8) {
				break;
			}
			System.out.printf("%d ", count);
		}
		
		System.out.printf("%nBroke out of the loop at count = %d%n", count);

	}

}
