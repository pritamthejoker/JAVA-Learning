import java.util.Scanner;

public class avg_of_three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        float avg = ((a+b+c)/3);
        System.out.println("Average of three number = " + avg);
    }
}