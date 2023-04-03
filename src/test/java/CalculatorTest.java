import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.ref.SoftReference;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;


public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void addTwoNumsTest(){
        Calculator.add( 2,2);
        Assert.assertEquals(Calculator.add(2,2 ),4 );
Assert.assertEquals(Calculator.add(2,2),3);

    }
    @Test
    public void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2,2),4);

        softAssert.assertEquals(Calculator.add(2,2),5);

        softAssert.assertEquals(Calculator.add(2,2),6);

        softAssert.assertEquals(Calculator.add(2,2),7);

        softAssert.assertEquals(Calculator.add(2,2),8);

        softAssert.assertAll();
    }
    @Test
    public void testAsserttrue(){
        assertTrue(SomeClass.isFunny(true));
        assertTrue(false);


    }
    @Test
    public void test123(){
        assertNotNull(null);

    }

}
