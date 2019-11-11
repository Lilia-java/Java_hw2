public class MyTriangle extends MyPoint {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1,int x2, int y2,int x3, int y3) {
        /*super(x1, y1);
        super(x2, y2);
        super(x3, y3);*/
        this.x=x1;
        this.y=y1;
        this.x=x2;
        this.y=y2;
        this.x=x3;
        this.y=y3;
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public double getPerimetr(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType(){
        double a=v1.distance(v2);
        double b=v2.distance(v3);
        double c=v3.distance(v1);
        if (a == b && b == c){
            return "Equilateral";
        }
        else if (a == b || b == c || c == a){
            return "Isosceles";
        }
        else {return "Scalene";}
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyTriangle that = (MyTriangle) o;

        if (!v1.equals(that.v1)) return false;
        if (!v2.equals(that.v2)) return false;
        return v3.equals(that.v3);
    }

    @Override
    public int hashCode() {
        int result = v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();
        return result;
    }
}

