public class BusinessTracker

{
   private String company;
   private int customers;
   private double money;

   public BusinessTracker(String comp, int cust, double dollars)
   {
      company = comp;
      customers = cust;
      money = dollars;
   }

   public String toString()
   {
       return "Company: " + company + "  Customers: " + customers + "  Sales: $" + money + "\n";
   }

}
