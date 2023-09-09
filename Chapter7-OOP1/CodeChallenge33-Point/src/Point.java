public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

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
//√() * (0 - x) + (0 − y) * (0 - y)
    //√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    //√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    public double distance(){
        int resultDistance = ((0-x)*(0-x) + (0-y) * (0-y));
        return Math.sqrt(resultDistance);
    }
    public double distance(int x, int y){
        int resultDistance = ((this.x-x)*(this.x-x) + (this.y-y) * (this.y-y));
        return Math.sqrt(resultDistance);
    }
    public double distance(Point point){
        int resultDistance = ((this.x-point.x)*(this.x-point.x) + (this.y-point.y) * (this.y-point.y));
        return Math.sqrt(resultDistance);
    }
}
