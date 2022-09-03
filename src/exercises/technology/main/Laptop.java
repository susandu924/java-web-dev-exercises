package exercises.technology.main;

import exercises.technology.main.Computer;

public class Laptop extends Computer {
    private boolean isIntelliJOpened;


    public Laptop(int screenWidth, int screenHeight, String manufacturerYear) {
        super(screenWidth, screenHeight, manufacturerYear);
        this.isIntelliJOpened = false;
    }
    public Laptop(int screenWidth, int screenHeight, String manufacturerYear, boolean isIntelliJOpened) {
        super(screenWidth, screenHeight, manufacturerYear);
        this.isIntelliJOpened = isIntelliJOpened;
    }

    public boolean getIsIntelliJOpened(){
        return this.isIntelliJOpened;
    }

    public void setIsIntelliJOpened(boolean isIntelliJOpened){
        this.isIntelliJOpened=isIntelliJOpened;
    }

    public void openIntelliJ(){
        this.isIntelliJOpened=true;
        System.out.println("IntelliJ is now open!");
    }
}