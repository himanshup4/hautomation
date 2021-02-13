package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {
    //setting normal priorities in test NG
    @BeforeClass
    public void setUp() {
        System.out.println("Test Priority > before Class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("Test Priority > after Class");
    }
    @Test(priority = 2)
    public void testMethod1() {
        System.out.println("Test Priority > test Method1");
    }

    @Test(priority = 1)
    public void testMethod2() {
        System.out.println("Test Priority > testM23");
    }
    @Test(priority = 0)
    public void testMethod3() {
        System.out.println("Test Method3");
    }

}
