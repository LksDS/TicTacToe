public class Vector {
    private int x,y;
    public Vector(int x, int y){
        setX(x);
        setY(y);
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
    public int getY() {
        return y;
    }
}
