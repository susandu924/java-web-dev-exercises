package org.launchcode.java.demos.lsn6inheritance;

public class Main extends HouseCat{
    public static void main(String[]args){
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());
    }



    public Main(String aName, double aWeight) {


    }

}
