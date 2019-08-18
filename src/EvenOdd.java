import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%2==0){
            System.out.println("its a even number ");
        }
        else
            System.out.println("it is a odd number ");
        sc.close();

    }
}

