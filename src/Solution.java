import java.util.Scanner;
public class Solution {

    public static  double speed ;     // speed is given in meters per second
    public static double distance;      //distance is in meters

    public static void main(String[] args) {
        float g = 9.8f;
        double time;//time is taken in seconds
        Scanner sc = new Scanner(System.in);
        time = sc.nextDouble();

        System.out.println( "the speed of the object at time t seconds after its release is  : " +(g*time) +"m/s"+"the distance the object has travelled in those t seconds after its release is : "+ 0.5*g*Math.pow(time, 2)+"meters");
        //System.out.println("the distance the object has travelled in those t seconds after its release is : "+ 0.5*g*Math.pow(time, 2)+"meters");
    }

}
