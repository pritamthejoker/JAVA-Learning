public class type_conversation {

    public static void main(String[] args) {
        /*
        this code not acsept by the java compiler becouse type conversation only done small to big data type
        like some exemple = int --> long , float --> double .
        the hirarci is 
        byte -> sort -> int -> flat -> long -> double.
        
        long a = 102;
        int b = a;
        
        
        */

        //now the currect way of type coversation is writen below
        int a = 120;
        long b = a;
        System.out.println(b);
    }
}