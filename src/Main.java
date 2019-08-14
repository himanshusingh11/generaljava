import java.lang.*;//default package
import java.util.*;//scanner class  helps to take input from the user


public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//creates a object
        int num1 = sc.nextInt();// int x = Integer.parseInt(args[0]);
        int num2 = sc.nextInt();//int y = Integer.parseInt(args[ 1]);   go to run and then edit configurations
        int result = num1+num2;
        System.out.println(result);
        sc.close();


    }
}
