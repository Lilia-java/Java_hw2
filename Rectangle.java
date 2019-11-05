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

    String toString(float length,float width){
        return "Rectangle [length=" + length + ", width=" + width + "]";
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
