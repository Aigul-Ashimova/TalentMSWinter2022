package annotations;

import org.testng.annotations.*;

public abstract class BaseTest {
    @BeforeSuite
    public void setUp() {
        System.out.println("This is my before suite");
    }



        @BeforeClass
        public void beforeClass(){
            System.out.println("My BeforeClass");
        }

        @AfterClass
        public void afterClass(){
            System.out.println("My after class");
        }

    @AfterSuite
    public void DemoSuit(){
        System.out.println("This is my after suit");

}
   @BeforeMethod
    public void myBeforeMethod(){
       System.out.println("This my before method");
   }
    @AfterMethod
    public void myAfterMethod(){
        System.out.println("This my after method");
    }

}
