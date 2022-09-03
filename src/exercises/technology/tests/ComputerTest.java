package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    Computer myComputer;

    @Before
    public void beforeTest(){
        myComputer = new Computer(3000, 5000, "2021");
//        myComputer constructed here before tests run
    }

    @Test
    public void constructorSetsValuesTest(){
//        Computer myComputer = new Computer(3000, 5000, "2021");
        assertEquals(3000, this.myComputer.getScreenWidth());
        assertEquals(5000, this.myComputer.getScreenHeight());
        assertEquals("2021", this.myComputer.getManufacturerYear());
    }
    @Test
    public void twoPlusTwoTest(){
//        Computer myComputer = new Computer(3000, 5000, "2021");
        int result = this.myComputer.processTwoPlusTwo();
        assertEquals(4, result);

    }
}
