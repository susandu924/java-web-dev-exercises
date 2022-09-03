package exercises.technology.main;

public class Program {
    public static void main(String[] args){
        Smartphone mySmartPhone = new Smartphone(1500, 500, "2021", true );
//        mySmartPhone.makePhoneCall("314-330-5990");
//        int result = mySmartPhone.processTwoPlusTwo();
//        System.out.println("The result is: " + result);
        System.out.println(mySmartPhone.getId());
        Laptop myLapTop = new Laptop(2500, 1500, "2021");
//        myLapTop.openIntelliJ();
//        int result = myLapTop.processTwoPlusTwo();
//        System.out.println("Laptop result is: " + result);
        System.out.println(myLapTop.getId());

        Computer myComputer = new Computer(3000, 3000, "2021");
//        int computerResult = myComputer.processTwoPlusTwo();
//        System.out.println("Computer result: " +computerResult);
        System.out.println(myComputer.getId());
//
//        myComputer.tellAJoke();


    }
}
