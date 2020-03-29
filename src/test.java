import java.util.Arrays;
import java.util.Comparator;
public class test {
    public static void main(String[] args) {
        circle[] circles = new circle[3];
        circles[0] = new circle(5);
        circles[1] = new circle();
        circles[2] = new circle(1.2);
        System.out.println("pre-sorted: ");
        for (circle circle : circles){
            System.out.println(circle);
        }
        Comparator comparator = new comparator();
        Arrays.sort(circles,comparator);
        System.out.println("after-sorted: ");
        for (circle circle : circles){
            System.out.println(circle);
        }
    }
}
