package testclasses;

import appcode.FirstTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotation {

    @Test
    public void testMethod1() {
        FirstTest fs= new FirstTest();
        int result = fs.sumNumbers(1,2);
        System.out.println("Running Test -> testMethod1");
        Assert.assertEquals(result,4);
    }

    @Test
    public void testMethod2() {
        System.out.println("Running Test -> testMethod2");
        String expectedString ="Hello World";
        FirstTest fs= new FirstTest();

    }

    @Test
    public void testMethod3() {
        System.out.println("Running Test -> testMethod3");
        int [] expectedArray= {1,2,3};
        FirstTest fs= new FirstTest();
    }

}
