import java.util.Scanner;

public class product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b = sc.nextInt();
        int c = a*b;
        System.out.println("Prouct of two numbers = " + c);
    }
}