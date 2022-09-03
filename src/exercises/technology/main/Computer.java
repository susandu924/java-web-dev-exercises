package exercises.technology.main;

public class Computer extends AbstractEntity {

    private int screenWidth;
    private int screenHeight;
    private String manufacturerYear;

    public Computer(int screenWidth, int screenHeight, String manufacturerYear){
        this.screenWidth=screenWidth;
        this.screenHeight=screenHeight;
        this.manufacturerYear=manufacturerYear;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public String getManufacturerYear() {
        return manufacturerYear;
    }

    public int processTwoPlusTwo(){
        return 2+2;
    }
    public void tellAJoke(){
        System.out.println("Why did computer show up late at work? It had a hard drive!");
    }

}


