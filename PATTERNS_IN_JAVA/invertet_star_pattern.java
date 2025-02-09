import java.util.Scanner;
public class invertet_star_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see a magic = ");
        int n = sc.nextInt();
        sc.close();
        for(int i = n ;i >= 1;i--){
            for(int j = i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
