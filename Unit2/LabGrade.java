// ************************************************************************

//   LabGrade.java

//   This program computes a student's lab grade from

//   the grades on the three components of lab:  the pre-lab

//   assignment, the lab itself, and the post-lab assignment.

// ***********************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class LabGrade

{

    public static void main (String[] args)

    {
        DecimalFormat df = new DecimalFormat("#.###");

        // Declare constants

        double IN_WEIGHT;  // in-class weight is 60%

        double OUT_WEIGHT; // out-of-class weight is 40%

        // Declare variables

        double preLabPts;    //number of points earned on the pre-lab assignment

        double preLabMax;    //maximum number of points possible for pre-lab

        double labPts;       //number of poitns earned on the lab

        double labMax;       //maximum number of points possible for lab

        double postLabPts;   //number of points earned on the post-lab assignment

        double postLabMax;   //maximum number of points possible for the post-lab

        double outClassAvg;  //average on the out of class (pre and post) work

        double inClassAvg;   //average on the in-class work

        double labGrade;  //final lab grade

        Scanner scan = new Scanner(System.in);

        // Get the input 

        System.out.println("\nWelcome to the Lab Grade Calculator\n");

        System.out.print("Enter the number of points you earned on the pre-lab: ");

        preLabPts = scan.nextInt();

        System.out.print("What was the maximum number of points you could have earned? ");

        preLabMax = scan.nextInt();

        System.out.print("Enter the number of points you earned on the lab: ");

        labPts = scan.nextInt();

        System.out.print("What was the maximum number of points for the lab? ");

        labMax = scan.nextInt();

        System.out.print("Enter the number of points you earned on the post-lab: ");

        postLabPts = scan.nextInt();

        System.out.print("What was the maximum number of points for the post-lab? ");

        postLabMax = scan.nextInt();

        weights:
        System.out.print("What was the weight of in-class work in percent? ");

        IN_WEIGHT = scan.nextDouble() / 100.0;

        System.out.print("What was the weight of out-of-class work? ");

        OUT_WEIGHT = scan.nextDouble() / 100.0;

        double TOTAL_WEIGHT = IN_WEIGHT + OUT_WEIGHT;
        //  System.out.println("in " + IN_WEIGHT + " out " + OUT_WEIGHT + " total " + TOTAL_WEIGHT);  // debug feature, uncomment if needed

        // if values are not 100, return PEBKAC

        if (TOTAL_WEIGHT != 1) {
            System.out.print("Weights not equal to 100 percent!");
            return;
        }

        System.out.println();

        // Calculate the average for the out of class work

        outClassAvg = ((preLabPts + postLabPts) / (preLabMax + postLabMax)) * 100;

        // Calculate the average for the in-class work

        inClassAvg = labPts / labMax * 100;

        // Calculate the weighted average taking 40% of the out-of-class average

        // plus 60% of the in-class

        labGrade = OUT_WEIGHT * outClassAvg + IN_WEIGHT * inClassAvg;

        // Print the results

        System.out.println("Your average on out-of-class work is " + outClassAvg + "%");

        System.out.println("Your average on in-class work is " + inClassAvg + "%");

        System.out.println(IN_WEIGHT + "% of the grade was based on in-class work");

        System.out.println(OUT_WEIGHT + "% of the grade was based on out-of-class work");

        System.out.println("Your lab grade is " + df.format(labGrade) + "%");

        System.out.println();

    }

}