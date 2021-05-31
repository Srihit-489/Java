public class Room {
    private Bed bed;
    private Windows windows;
    private Doors doors;
    public Room(Bed b1,Windows w1,Doors d1){
        this.bed = b1;
        this.windows = w1;
        this.doors = d1;
    }

    private Bed getBed() {
        return bed;
    }

    private Windows getWindows() {
        return windows;
    }

    private Doors getDoors() {
        return doors;
    }

    public boolean CanIseeMyBed(){
        return bed.isReadyForSleep();
    }

    public void sleep(){
        if(this.bed.isReadyForSleep()){
            System.out.println("OK great the bed is ready");
        }else{
            System.out.println("Ohh god should I make my Bed ready!!!");
            this.bed.makeitready();
        }
        this.doors.shutTheDoors();
        this.windows.openWindows();
        System.out.println("Great everything is done good night bro");
    }
}
