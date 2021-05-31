public class Doors {
    private int noOfdoors;
    private boolean openOrNot;
    public Doors(){
        this(1,true);
    }
    public Doors(int doors,boolean state){
        this.noOfdoors = doors;
        this.openOrNot = state;
    }

    public int getNoOfdoors() {
        return noOfdoors;
    }

    public boolean isOpenOrNot() {
        return openOrNot;
    }

    public void shutTheDoors(){
        if(this.openOrNot){
            System.out.println("great I have already closed the doors");
        }else{
            System.out.println("Now I closed the doors");
        }
    }
}
