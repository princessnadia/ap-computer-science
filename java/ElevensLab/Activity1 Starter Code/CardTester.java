/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card lucky = new Card("Ace","Spades",100);
		Card luckiest = new Card("King","Hearts",200);
		Card lucky2 = new Card("Ace","Spades",100);
		System.out.println(lucky.suit());
		System.out.println(lucky.rank());
		System.out.println(lucky.pointValue());
		System.out.println(lucky.matches(luckiest));
		System.out.println(lucky.matches(lucky2));
		System.out.println(lucky);
	}
}
