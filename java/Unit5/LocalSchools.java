public class LocalSchools
{
    public static void main (String[] args)
    {
        Information CUSD300Office = new Information ("Consolidate Unit District 300", "300 Cleveland Ave.", "Carpentersville", 60110, "Michael Bregy", 20856);
        Information District155Office = new Information ("District 155", "1 South Virginia Road", "Crystal Lake", 60014, "Jill Hawk", 6872);
        Information jacobsAddress = new Information ("2601 Bunker Hill Drive", "Algonquin", 60102, "Ami Engel", 2253);
        Information hampshireAddress = new Information ("1600 Big Timber Road", "Hampshire", 60140, "Chuck Bumbales", 1092);
        Information dundeecrownAddress = new Information ("1 Charger Country", "Carpentersville", 60110, "Lynn McCarthy", 2624);
        Information crystallakecentralAddress = new Information ("45 W. Franklin Ave.", "Crystal Lake", 60014, "Steve Olson", 1574);
        Information carygroveAddress = new Information ("2208 Three Oaks Road", "Cary", 60013, "Jay Sargeant", 1881);
        
        Schools jacobs = new Schools ("Harry D. Jacobs High School", jacobsAddress, CUSD300Office);
        Schools carygrove = new Schools ("Cary-Grove High School", carygroveAddress, District155Office);
        Schools hampshire = new Schools ("Hampshire High School", hampshireAddress, CUSD300Office);
        Schools dundeecrown = new Schools ("Dundee-Crown High School", dundeecrownAddress, CUSD300Office);
        Schools crystallakecentral = new Schools ("Crystal Lake Central High School", crystallakecentralAddress, District155Office);
        
        System.out.print("\f");
        System.out.println(jacobs);
        System.out.println(carygrove);
        System.out.println(dundeecrown);
    }
}