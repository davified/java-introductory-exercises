import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/* Created by davified on 4/12/16. */
public class TriangleTest {

    Triangle triangle;

    @Before
    public void init() {
        triangle = new Triangle();
    }

    @Test
    public void drawOne() throws Exception {
        assertEquals("*", triangle.drawOne());
    }

}