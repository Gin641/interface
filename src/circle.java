public class circle {
    private double radius;
    public circle(){
    }
    public circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public String toString(){
        return "radius = " + radius;
    }
}
