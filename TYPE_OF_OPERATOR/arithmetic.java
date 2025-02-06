public class arithmetic {

    public static void main(String[] args) {
        System.out.println("Binary Operation");
        int a = 10,b = 20;
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a % b = " + (a%b));

        System.out.println("unary Operation");
        System.out.println("a++ means(a = a + 1) = " + ++a);
        System.out.println("a-- means(a = a - 1) = " + --a);

        //unary operator are two type 
        //one is pre incremental/dicrimental (++a first change then use) 
        //and another is pose incrimental/dicremental(a++ first use and then change)
        System.out.println("a=10 i am implementing a++ now see the value = " + a++ + " use then change");
        System.out.println("a = 11 i am implementing ++a now see the value = " + ++a + " change then use");
    }
}