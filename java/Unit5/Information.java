public class Information
{
	private String name, addr, city, head;
	private int zipc, popu;
	// ("Consolidate Unit District 300", "300 Cleveland Ave.", "Carpentersville", 60110, "Michael Bregy", 20856)
	public Information(String inp_name, String inp_addr, String inp_city, int inp_zipc, String inp_head, int inp_popu)
	{
		name = inp_name;
		addr = inp_addr;
		city = inp_city;
		zipc = inp_zipc;
		head = inp_head;
		popu = inp_popu;
	}
	
	// ("2601 Bunker Hill Drive", "Algonquin", 60102, "Ami Engel", 2253)
	public Information(String inp_addr, String inp_city, int inp_zipc, String inp_head, int inp_popu)
	{
		name = null;
		addr = inp_addr;
		city = inp_city;
		zipc = inp_zipc;
		head = inp_head;
		popu = inp_popu;
	}
	
	public String toString()
	{
		if (name == null)
		{
			return ("\n" + addr + "\n" + city + " " + zipc + "\n" + head + "\nPop: " + popu + "\n");
		}
		return (name + "\n" + addr + "\n" + city + " " + zipc + "\n" + head + "\nPop: " + popu + "\n");
	}
}