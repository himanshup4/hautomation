package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Group_Priority {
    //setting normal priorities in test NG
    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.out.println("Test Priority > before Class");
    }

    @Test(groups = {"cars", "bmw"})
    public void testBMW() {
        System.out.println("Running BMW test case");
    }

    @Test(groups = {"cars", "sedan"})
    public void testAudi() {
        System.out.println("Running Audi test case");
    }
    @Test (groups = {"bike"})
    public void Bike1() {
        System.out.println("Running Bike1 test case");
    }
    @Test(groups = {"bike"})
    public void Bike2() {
        System.out.println("Running Bike2 test case");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("Test Priority > after Class");
    }

}
