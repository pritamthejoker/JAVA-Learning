import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int num = sc.nextInt();
        sc.close();
        if(num >= 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negitive");
        }
    }
}