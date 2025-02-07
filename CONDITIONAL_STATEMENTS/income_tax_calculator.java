import java.util.Scanner;

public class income_tax_calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income = ");
        int income = sc.nextInt();
        int tax;
        sc.close();
        if(income < 500000){
            tax = 0;
        }
        else if(income < 1000000 && income >= 500000){
            tax = (int) (income*0.2);
        }
        else{
            tax = (int) (income*0.3);
        }
        System.out.println("Tax is = " + tax);
    }
}