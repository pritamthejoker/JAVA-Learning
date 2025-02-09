import java.util.Scanner;

public class char_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to see a Pattern = ");
        int n = sc.nextInt();
        sc.close();
        char counter = 'A';
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}