public class MyBankAccounts
{
    public static void main (String[] args)
    {
        BankManager kirito = new BankManager ("Kazuto", "Kirigaya", 6500, 1234, false, "M");
        BankManager asuna = new BankManager ("Asuna", "Yuuki", 1700, 5983, false, "F");
        BankManager sterben = new BankManager ("Shouichi", "Shinkawa", 2200, 9362, false, "M");
        BankManager leafa = new BankManager ("Suguha", "Kirigaya", false, "F");
        BankManager silica = new BankManager ("Keiko", "Ayano", 500, false, "F");
        
        System.out.println("\f" + kirito +  "\n" + asuna + "\n" + sterben +  "\n" + leafa +  "\n" + silica);
        
		// Kirito gets married to Asuna :3
        kirito.gotMarried();
        
		// also change Asuna's marriage status and specify last name change
        asuna.gotMarried(kirito);
        System.out.println("\nKirito and Asuna got married!");
        System.out.println(kirito +  "\n" + asuna + "\n" + sterben +  "\n" + leafa +  "\n" + silica);
       
        // obviously \TheOTP puts their accounts together :3
        kirito.combineAccounts(asuna);
        System.out.println("\nKirito and Asuna combined bank accounts into Kirito's account");
        System.out.println(kirito + "\n" + sterben +  "\n" + leafa +  "\n" + silica);
        
        // how does Sterben get married with Leafa? (couldn't think of anyone)
        sterben.gotMarried();
        
        // other way around, why do i do this to myself
        // Keep her maiden name stored at a string called maidenName just in case.....
        leafa.gotMarried(sterben);
        System.out.println("\nVinny and Terra got married!");
        System.out.println(kirito + "\n" + sterben +  "\n" + leafa +  "\n" + silica);
       
        //Vinny and Terra getting divorced, change marriage status to false and leafas last name back
        sterben.gotDivorced();
        leafa.gotDivorced();
        System.out.println("\nVinny and Terra got divorced");
        System.out.println(kirito + "\n" + sterben +  "\n" + leafa +  "\n" + silica);
       
        //Vinny marries Katie, changes marriage status back to true
        sterben.gotMarried();
        
        //Katie marries Vinny, changes marriage status to true and her last name to Neil
        silica.gotMarried(sterben);
        System.out.println("\nVinny and Katie got married");
        System.out.println(kirito + "\n" + sterben +  "\n" + leafa +  "\n" + silica);
       
        //Vinny and Katie create a new bank account with both of their money in it.
        sterben.combineAccounts(silica); 
        System.out.println("\nVinny and Katie combined bank accounts");
        System.out.println(kirito + "\n" + sterben +  "\n" + leafa);
    }
}