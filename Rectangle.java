public class Rectangle {
    public float length;
    public float width;

    public Rectangle(float length, float weidth) {
        this.length = length;
        this.width = weidth;
    }

    public float getLength() {
        return length;
    }

    public float getWeidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWeidth(float weidth) {
        this.width = weidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Float.compare(rectangle.length, length) == 0 &&
                Float.compare(rectangle.width, width) == 0;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    double getArea(){
        double sq;
        sq=length*width;
        return sq;
    }
    double getPerimetr(){
        double p;
        p=2*(length+width);
        return p;
    }
}
