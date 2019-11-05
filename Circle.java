public class Circle {
    public double radius;
    public String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    String toString(double radius,String color){
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
    double getArea(){
        double sq;
        sq=Math.PI * radius * radius;
        return sq;
    }
}
