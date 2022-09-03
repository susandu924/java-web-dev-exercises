package exercises.technology.main;

import exercises.technology.main.Computer;

public class Smartphone extends Computer {
    private boolean isConnectedTo5g;

    public Smartphone(int screenWidth, int screenHeight, String manufacturerYear, boolean isConnectedTo5g) {
        super(screenWidth, screenHeight, manufacturerYear);
        this.isConnectedTo5g = isConnectedTo5g;
    }

    public boolean getIsConnectedTo5g(){
        return this.isConnectedTo5g;
    }
    public void makePhoneCall(String number){
        System.out.println("Calling: " + number);
    }
}
