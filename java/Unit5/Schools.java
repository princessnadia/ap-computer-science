public class Schools
{
	private String name;
	private Object scad, ofad;
	// ("Harry D. Jacobs High School", jacobsAddress, CUSD300Office);
	public Schools(String inp_name, Object inp_scad, Object inp_ofad)
	{
		name = inp_name;
		scad = inp_scad;
		ofad = inp_ofad;
	}
	
	public String toString()
	{
		return name + scad + ofad;
	}
}