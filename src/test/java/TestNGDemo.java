import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
    @Test
    public void createNewTest(){
        User firstUser = new User("J);
        Assert.assertNotNull(firstUser);
    }
}
