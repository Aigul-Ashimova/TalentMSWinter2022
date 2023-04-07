import org.testng.Assert;
import org.testng.annotations.Test;




public class TestNGDemo {
    @Test
    public void createNewUserTest(){
        User firstUser = new User( "John",44);
        Assert.assertNotNull(firstUser);
    }
    @Test
    public void loginTest(){

    }

}
