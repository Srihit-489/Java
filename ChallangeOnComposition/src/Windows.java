public class Windows {
    private int numberOfWIndows;
    private int heightOfWindow;
    private int widthOfwindows;
    private boolean openorclose;
    public Windows(int windows,int height,int width,boolean openorclose){
        this.numberOfWIndows = windows;
        this.heightOfWindow = height;
        this.widthOfwindows = width;
        this.openorclose = openorclose;
    }

    public int getNumberOfWIndows() {
        return numberOfWIndows;
    }

    public int getHeightOfWindow() {
        return heightOfWindow;
    }

    public int getWidthOfwindows() {
        return widthOfwindows;
    }

    public boolean isOpenorclose() {
        return openorclose;
    }
    public void openWindows(){
        if(this.openorclose){
            System.out.println("Great they are already open");
        }else{
            this.openorclose = true;
            System.out.println("Let me have some fresh air from windows");
        }
    }
}
