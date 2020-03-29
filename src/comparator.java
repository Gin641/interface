import java.util.Comparator;

public class comparator implements Comparator<circle> {
    @Override
    public int compare(circle c1, circle c2){
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
