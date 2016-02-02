import java.util.*;
public class ShoppingCartSim
{
    public static void main(String[] args)
    {
        boolean end = false,;
        System.out.println("Welcome to Marketropolis Market!");
	ShoppingCart mycart = new ShoppingCart();
        Scanner inp = new Scanner(System.in);
	do
        {
	    System.out.print("\n(S) Get which item? > ");
            String a = inp.next();
	    System.out.print("\n(D) How much is it? > ");
	    double b = inp.nextInt();
	    System.out.print("\n(I) How many? > ");
	    int c = inp.nextInt();
	    mycart.addToCart(a,b,c);
	    
	    System.out.print("\n(Y/N) Get another item? > ");
            String d = inp.next();
	    switch (d)
	    {
              case "y":
	        // nothing
		break;
              case "n":
	        end = true;
		break;
              default:

	    }
        } while (!end);
    }
}
