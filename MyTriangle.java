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
    public String toString(){
        return "1:" + v1 + ", 2:" + v2 + ", 3:" + v3 ;
    }
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        MyTriangle e = (MyTriangle) o;
        return (this.getXY() == e.getXY());
    }
    public double getPerimetr(){
    return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    public String getType(){
        if (v1.equals(v2) && v2.equals(v3)){
            return "Equilateral";
        }
        else if (v1.equals(v2) || v1.equals(v3) || v3.equals(v2)){
            return "Isosceles";
        }
        else {return "Scalene";}
    }

}

