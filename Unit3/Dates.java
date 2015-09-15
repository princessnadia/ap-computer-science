// ****************************************************************

// Dates.java

//

// Determine whether a 2nd-millenium date entered by the user

// is valid         

// ****************************************************************

import java.util.Scanner;

 

public class Dates

{

    public static void main(String[] args)

    {

      int mm = 0, dd = 0, yy = 0, ddimm = 0;

      boolean mmv = false, yyv = false, ddv = false, lyy = false;

      Scanner inp = new Scanner(System.in);

      System.out.print("Enter month (1-12): ");
      mm = inp.nextInt();
      
      System.out.print("Enter day (1-31): ");
      dd = inp.nextInt();
      
      System.out.print("Enter year (1000-1999): ");
      yy = inp.nextInt();
      
      if (mm >= 1 && mm <= 12) mmv = true;
      else mmv = false;

      if (yy >= 1000 && yy <= 1999) yyv = true;
      else mmv = false;

      if (yy % 400 == 0 || (yy % 4 == 0 && yy % 100 != 0)) lyy = true;
      else lyy = false;

 

      //Determine number of days in month
          switch (mm) {
              case 1: ddimm = 31; break;
              case 2: if (lyy) ddimm = 29; else ddimm = 28; break;
              case 3: ddimm = 31; break;
              case 4: ddimm = 30; break;
              case 5: ddimm = 31; break;
              case 6: ddimm = 30; break;
              case 7: ddimm = 31; break;
              case 8: ddimm = 31; break;
              case 9: ddimm = 30; break;
              case 10: ddimm = 31; break;
              case 11: ddimm = 30; break;
              case 12: ddimm = 31; break;
            }

      if (dd <= ddimm) ddv = true;

      System.out.println("input date is " + yy + "/" + mm + "/" + dd);
      if (ddv && mmv && yyv) System.out.print("Date is valid!");
      else System.out.print("Date is invalid!");
 

    }

}