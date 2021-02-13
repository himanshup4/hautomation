package testclasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNg_Priority {

    @BeforeClass
    public void setUp(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void cleanUp(){
        System.out.println("After Class");

    }

    @Test
    public void testMethod1(){
        System.out.println("Test Method 1");

    }

    @Test
    public void testMethod2(){
        System.out.println("Test Method 2");
    }

    @Test(priority=0)
    public void testMethod3(){
        System.out.println("Test Method 3");
    }
}
