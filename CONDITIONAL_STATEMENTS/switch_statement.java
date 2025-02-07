import java.util.Scanner;

public class switch_statement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("                  Manu                ");
        System.out.println("--------------------------------------");
        System.out.println("Mango - 1");
        System.out.println("Apple - 2");
        System.out.println("Lemon - 3");
        System.out.println("--------------------------------------");
        System.out.print("Enter your chosen food number = ");
        int a = sc.nextInt();
        sc.close();
        switch(a){
            case 1:System.out.println("Mango");
            break;
            case 2:System.out.println("Apple");
            break;
            case 3:System.out.println("Lemon");
            break;
            default:System.out.println("Nothing only water");
        }
    }
}