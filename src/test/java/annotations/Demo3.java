package annotations;

import com.beust.ah.A;
import com.digital.Calculator;
import org.testng.Assert;

import org.testng.annotations.Test;

public class Demo3 {
    @Test(priority = 1)
    public void myFirstTest(){
        Assert.assertEquals(Calculator.add(4,5),10);

    }
    @Test(priority = 2)
    public void mySecondTest(){
        Assert.assertEquals(false,true);

    }
    @Test(priority = 3)
    public void myStopTest(){
        Assert.assertEquals(Calculator.stop("Asel"),"Izat");
    }
}
