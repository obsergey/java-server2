import org.exaple.server.TestController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class TestControllerTest {
    TestController testController = new TestController();

    @Test
    public void testControllerPing() {
        Assert.assertEquals(testController.ping(), "pong");
    }

    @Test
    public void testControllerHello() {
        Assert.assertEquals(testController.hello("world"), "Hello world");
    }
}