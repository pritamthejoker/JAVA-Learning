import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        int a = sc.nextInt();
        System.out.print("Enter number 2 = ");
        int b = sc.nextInt();
        System.out.print("Enter the operator = ");
        char c = sc.next().charAt(0);
        sc.close();
        switch (c) {
            case '+':System.out.println("a + b = " + (a+b));
                
            break;
            case '-':System.out.println("a - b = " + (a-b));
                
            break;
            case '*':System.out.println("a * b = " + (a*b));
                
            break;
            case '/':System.out.println("a / b = " + (a/b));
                
            break;
            case '%':System.out.println("a % b = " + (a%b));
                
            break;
        
            default:System.out.println("Invalide operator ...");
                break;
        }
        
    }
}