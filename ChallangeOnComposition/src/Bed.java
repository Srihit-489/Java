public class Bed {
    private boolean readyForSleep;
    private String State;
    public Bed(){
        this(false,"Not Ready");
    }
    public Bed(boolean sleep,String state){
        this.readyForSleep = sleep;
        if(state.equals("Ready") ||  state.equals("Not Ready")){
            this.State = state;
        }else{
            System.out.println("Invalid state but assuming as not ready");
        }
        //this.State = state;
    }

    public boolean isReadyForSleep() {
        return readyForSleep;
    }

    public String getState() {
        return State;
    }

    public void makeitready(){
        //some things
        this.readyForSleep = true;
        this.State = "Ready";
    }
}
