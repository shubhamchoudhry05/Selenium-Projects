import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class SampleTest {
    @Test
    public void sampleTest() {
        assertTrue(true, "This test will always pass.");
    }

    @Test
    public void anotherTest() {
        assertTrue(false, "This test will fail.");
    }
}

