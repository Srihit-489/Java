public class Coordinates {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    boolean CheckUpSide(){
        if(y < x){
            return true;
        }else{
            return false;
        }
    }

    boolean CheckRightSide(int n){
        if(x == n){
            return false;
        }else{
            return true;
        }
    }

}
