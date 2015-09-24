public class Rooms
{
    private String desc;
    public Rooms(int rmX, int rmY)
    {
        if (rmX == 0 && rmY == 0) {
            desc = "you are in a plain room, flooded by light above. there is a (door) behind you, and a (note) to your left.";
            
        }
    }
    public String desc()
    {
        return desc;
    }
}
