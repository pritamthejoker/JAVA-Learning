

public class function_overlodig {
    public static int box_area(int side){
        int area = side * side;
        return area;
    }
    public static int box_area(int side1 ,int side2){
        int area = side1 * side2;
        return area;
    }
    public static float box_area(float side){
        float area = side * side;
        return area;
    }
    public static float box_area(float side1 , float side2){
        float area = side1 * side2;
        return area;
    }


    public static void main(String[] args) {
        float side = 2.2f;
        System.out.println("The area of the box is = " + box_area(side)); 
        
    }
}