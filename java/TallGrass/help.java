import java.util.*;
public class help
{
	private Scanner inp = new Scanner(System.in);
	public static void logo()
    {
        System.out.println("  _____     _ _  ____                   ");
        System.out.println(" |_   _|_ _| | |/ ___|_ __ __ _ ___ ___ ");
        System.out.println("   | |/ _` | | | |  _| '__/ _` / __/ __|");
        System.out.println("   | | (_| | | | |_| | | | (_| \\__ \\__ \\");
        System.out.println("   |_|\\__,_|_|_|\\____|_|  \\__,_|___/___/");
    }
    
	public static void menu()
	{
		logo();
		System.out.println("-- TALLGRASS MANUAL --" +
		"\n(Enter a number to go to the chapter.)"		+ 
		"\n1) Introduction" +
		"\n2) ");
		
	}
}