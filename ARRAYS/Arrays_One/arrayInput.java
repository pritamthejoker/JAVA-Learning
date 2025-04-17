import java.util.Scanner;
public class arrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //at first we creat the array
        int pritam[] = new int[5];
        //now we take input in array using Scanner class
        System.out.println("Enter the value of array :");
        pritam[0] = sc.nextInt();
        pritam[1] = sc.nextInt();
        pritam[2] = sc.nextInt();
        pritam[3] = sc.nextInt();
        pritam[4] = sc.nextInt();
        sc.close();
        
        //for output we are using syso(arrayName[Position])
        System.out.print("The array is = ");
        System.out.print(" " + pritam[0]);
        System.out.print(" " + pritam[1]);
        System.out.print(" " + pritam[2]);
        System.out.print(" " + pritam[3]);
        System.out.print(" " + pritam[4]);
    }
}