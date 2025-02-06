import java.util.Scanner;

public class area_of_circle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the redias of the circle = ");
        float a,area;
        a = sc.nextInt();
        area = 3.14f*a*a;
        System.out.println("Area or the circle is = " + area);
    }
}