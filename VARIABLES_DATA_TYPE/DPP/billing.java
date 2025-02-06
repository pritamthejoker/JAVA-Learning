import java.util.Scanner;

public class billing{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pc,pe,er;
        System.out.print("Enter the prize of pencil = ");
        pc = sc.nextInt();
        System.out.print("Enter the prize of pen = ");
        pe = sc.nextInt();
        System.out.print("Enter the prize of eraser = ");
        er = sc.nextInt();
        float total,tax;
        total = pc+pe+er;
        tax = (total * 18)/100;
        total = total + tax;
        System.out.println("The grand total is = " + total);
        
    }
}