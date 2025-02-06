public class logical {

    public static void main(String[] args) {
        System.out.println("Statement 1 = (3 <= 2) and Statement 2 = (4 >= 2) then S1 && S2 value = " + ((3 <= 2)&&(4 >= 2)));
        System.out.println("Statement 1 = (3 <= 2) and Statement 2 = (4 >= 2) then S1 || S2 value = " + ((3 <= 2)||(4 >= 2)));
        System.out.println("Statement = (3 <= 2) then !(S) value = " + !(3 <= 2));
    }
}