public class Main {
    public static void main(String[] args) {
        Bed mybed = new Bed();
        Windows mywindows = new Windows(5,4,6,false);
        Doors mydoor = new Doors();
        Room myroom = new Room(mybed,mywindows,mydoor);
        System.out.println("Ok now I am in my room let me sleep");
        System.out.println("Is my bed ready for sleep "+myroom.CanIseeMyBed());
        myroom.sleep();
        System.out.println("Is my bed ready for sleep "+myroom.CanIseeMyBed());

    }
}
