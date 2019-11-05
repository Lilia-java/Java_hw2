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

    public String toString(){
        return "X=" + x + ", Y=" + y;
    }
    public double distance(MyPoint m){
        double d=Math.sqrt((m.x-x)*(m.x-x)+(m.y-y)*(m.y-y));
        return d;
    }
}
