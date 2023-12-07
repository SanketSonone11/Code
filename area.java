import java.util.*;
public class Area {
    public static void main(String args[]){
        System.out.println("Area of circle");
        System.out.println("Enter the Radius of the circle:");
        Scanner sc = new Scanner(System.in);
        Float r = sc.nextFloat();
        double Area =   (3.14 * r *r);
        System.out.println(Area);
        sc.close();
    }
    
}
