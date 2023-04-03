import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

public class Demo {

    @Test
    public void reverseIt() {
    String name = "Aigul";
    StringBuilder sb = new StringBuilder(name);
    String reversedName = sb.reverse().toString();
    String expectedReversedName="lugiA";

        Assert.assertEquals(reversedName,expectedReversedName);
}
}
