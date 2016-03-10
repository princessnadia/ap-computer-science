/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rn = {"Ace","Two","Three","Queen"};
		String[] su = {"Spades","Diamonds","Clubs","Hearts"};
		int[] va = {1,2,3,12};
	    Deck d = new Deck(rn,su,va);
	    for (int m = 0; m <= (rn.length * 4); m++)
	    System.out.println(d.deal());
	}
}
