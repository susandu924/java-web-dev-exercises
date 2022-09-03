package exercises.technology.tests;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop myLaptop;

    @Before
    public void beforeTest(){
        myLaptop = new Laptop(3000, 5000, "2021", true);
//        myComputer constructed here before tests run
    }

    @Test
    public void constructorSetsValuesTest(){
//        Computer myComputer = new Computer(3000, 5000, "2021");
        assertEquals(3000, this.myLaptop.getScreenWidth());
        assertEquals(5000, this.myLaptop.getScreenHeight());
        assertEquals("2021", this.myLaptop.getManufacturerYear());
        assertEquals(true, this.myLaptop.getIsIntelliJOpened());
    }

    @Test
    public void openIntelliJSetsIsIntelliJOpenedToTrueTest(){
        this.myLaptop.setIsIntelliJOpened(false);
//        this is the setter so it should set is itelljopen to false

        assertEquals(false, this.myLaptop.getIsIntelliJOpened());
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.myLaptop.getIsIntelliJOpened());
    }
}
