import java.util.*;

public class LakeLazyDays
{
   public static void main (String[] args)
   {
       Scanner inp = new Scanner(System.in);
       Random gen = new Random();
       int a;
       String b;
       System.out.println("----- Lake Lazy Days Resortへようこそ! -----");
       System.out.println("活性は, 天候に基づいています.");
       System.out.print("温度は何ですか?: ");
       a = inp.nextInt();
       if (a > 70) b = "熱い";
       else if (a >= 40 && a <= 70) b = "暖かい";
       else b = "寒い";
       // System.out.println("temp desc var is " + b + "\ntemp int var is " + a);
       if (a > 95 || a < 20) System.out.println("何もできない、それはあまりにも" + b + "です. ショップをご覧ください!");
       else System.out.print("やや" + b + "です! ");
       if (a >= 80 && a <= 95) System.out.print("水泳プールに行くぜ!");
       else if (a < 80 && a >= 60) System.out.print("テニスを遊ぶ！");
       else if (a < 60 && a >= 40) System.out.print("ゴルフを遊ぶ!");
       else if (a < 40 && a >= 20) System.out.print("スキーに行くぜ!");
    }
}
