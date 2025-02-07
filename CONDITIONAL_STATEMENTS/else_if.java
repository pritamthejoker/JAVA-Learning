import java.util.Scanner;

public class else_if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        sc.close();
        if(age >= 18){
            System.out.println("Adalt");
        }
        else if(age < 18 && age > 12){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Kids");
        }
    }
}