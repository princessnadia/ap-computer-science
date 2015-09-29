public class Use
{
    private int rmuX, rmuY, emiu;
    public boolean[] items = new boolean[255];
    public Use(int rmX, int rmY, int emi)
    {
        rmuX = rmX;
        rmuY = rmY;
        emiu = emi;
    }
    public String runItem(int emi)
    {
        String statement = "";
        if (rmuX == 0 && rmuY == 0) {
            
            switch(emi) {
            case 0:
                if (items[3])
                {
                    items[1] = true;
                    System.out.println("the door opens when you put the code in.");
                } else {
                    System.out.println("what's the code?");
                }
                break;
            case 1:
                if (items[3])
                {
                    items[1] = true;
                    System.out.println("the door opens when you put the code in.");
                } else {
                    System.out.println("what's the code?");
                }
                break;
            default:
                System.out.println("use what?");
                break;
           }
        }
        return statement;
    }
}
