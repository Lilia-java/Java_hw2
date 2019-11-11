public class MyPoint {
    public int x;
    public int y;

    public MyPoint() {

    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int[] xy = new int [2];
        return xy;
    }

    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyPoint myPoint = (MyPoint) o;

        if (x != myPoint.x) return false;
        return y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(MyPoint m){
        double d=Math.sqrt((m.x-x)*(m.x-x)+(m.y-y)*(m.y-y));
        return d;
    }
}
