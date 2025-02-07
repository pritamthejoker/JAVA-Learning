import java.util.Scanner;

public class print_the_largest_of_two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number a and b : ");
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        if(a>b){
            System.out.println("a = " + a + " is greater then b = " + b);
        }
        else{
            System.out.println("b = " + b + " is greater then a = " + a);
        }

    }
}