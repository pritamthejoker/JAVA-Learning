import java.util.Scanner;

public class area_of_squar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,area;
        System.out.print("Enter the size of one side of a squar = ");
        a = sc.nextInt();
        area = a*a;
        System.out.println("The area of this squar in = " + area);
    }
}