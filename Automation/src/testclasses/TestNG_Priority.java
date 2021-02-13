package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Priority {
    @BeforeClass
    public void setUp() {
        System.out.println("Test Priority > before Class");
    }

    @AfterClass
    public void cleanUp() {
        System.out.println("Test Priority > after Class");
    }
    @Test
    public void testMethod1() {
        System.out.println("Test Priority > tsetMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Priority > tsetM23");
    }
    @Test
    public void testMethod3() {
        System.out.println("Test Priority > tsetMethod3");
    }

}
