package exercises.technology.tests;

import exercises.technology.main.Laptop;
import exercises.technology.main.Smartphone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartphoneTest {
    Smartphone mySmartphone;

    @Before
    public void beforeTest(){
       mySmartphone = new Smartphone (3000, 5000, "2021",true);
//        myComputer constructed here before tests run
    }

    @Test
    public void constructorSetsValuesTest(){
//        Computer myComputer = new Computer(3000, 5000, "2021");
        assertEquals(3000, this.mySmartphone.getScreenWidth());
        assertEquals(5000, this.mySmartphone.getScreenHeight());
        assertEquals("2021", this.mySmartphone.getManufacturerYear());
        assertEquals(true, this.mySmartphone.getIsConnectedTo5g());
    }
}
