package annotations;

import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.*;


public class DemoClass extends BaseTest {


    @Test(dependsOnMethods ="DemoTest2" )
    @Description("Verify this test")
    public void DemoTest1() {
        System.out.println("Demo test1 _________");

    }

    @Test
    public void DemoTest2() {
        System.out.println("Demo test2");
        Assert.assertEquals("100", "101");
    }

    @BeforeMethod
    public void DemoBefore() {
        System.out.println("Demo Before");
    }

    @AfterMethod
    public void DemoAfter() {
        System.out.println("Demo After");
    }

    @BeforeClass
    public void DemoBeforeClass() {
        System.out.println("Demo Before Class");
    }


    @AfterClass
    public void DemoAfterClass() {
        System.out.println("Demo After Class");

    }
    @BeforeTest
    public void DemoBeforeTest(){
        System.out.println("Demo Test Class");

    }




}
