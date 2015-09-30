import java.util.*;
public class Use
{
    private int rmuX, rmuY, emiu;
    public boolean[] items = new boolean[255];
    private static Scanner inp = new Scanner(System.in); 
    public Use(int rmX, int rmY, int emi)
    {
        rmuX = rmX;
        rmuY = rmY;
        emiu = emi;
    }

    public void runItem(int emi, int em, int ps)
    {
        String statement = "";
        if (rmuX == 0 && rmuY == 0) {

            switch(emi) {
                case 0:
                boolean keypadfi = false;
                final int emp = em;
                int empg = 0;
                final int psp = ps;
                int pspg = 0;
                while (!keypadfi) {
                    System.out.print("Enter employee ID: ");
                    empg = inp.nextInt();
                    System.out.print("\nEnter password: ");
                    pspg = inp.nextInt();
                    if (empg == emp && pspg == psp) {
                        System.out.println("Correct.");
                        keypadfi = true;
                    } else {
                        switch(empg) {
                            default:
                            System.out.println("Incorrect.");
                            break;
                            case 7035:
                            System.out.println("Welcome, Marlene.");
                            break;
                        }
                    }
                }
                break;
                case 1:
                if (items[0])
                {
                    System.out.println("the door opens!");
                    items[1] = true;
                } else {
                    System.out.println("yeah, it's locked.");
                }
                break;
                case 3:
                System.out.println("noted!");
                items[3] = true;
                break;
                default:
                System.out.println("use what?");
                break;
            }
        }
    }
}
