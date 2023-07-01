import java.util.*;
import java.lang.Math;


public class AngleBwClockPins{
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in hour");
        double x = sc.nextDouble();
        System.out.println("Enter the time in minute");
        double y = sc.nextDouble();
        double count = 5;
        double ans = 0;
        

        ans = Math.abs(((x - (y / count)) * 30) + (y * 0.5));
        double ans2 = 360 - ans;

        ans2 = Math.abs(ans2);

        System.out.println(
                "the degree between hour pin and minute pin is --->" + ans2 + " \n\t degree and      " + ans + "   degree");
        sc.close();
    }
}