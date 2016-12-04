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

    @Test
    public void drawHorizontalLine() throws Exception {
        assertEquals("*****", triangle.drawHorizontalLine(5));
    }

    @Test
    public void drawVerticalLine() throws Exception {
        assertEquals("*\n*\n*\n*\n*\n", triangle.drawVerticalLine(5));
    }

    @Test
    public void drawRightTriangle() throws Exception {
        assertEquals("*\n**\n***\n****\n", triangle.drawRightTriangle(4));
    }

    @Test
    public void drawIsoscelesTriangle() throws Exception {
        assertEquals("  *  \n *** \n*****\n", triangle.drawIsoscelesTriangle(3));
    }

    @Test
    public void drawBigIsoscelesTriangle() throws Exception {
        assertEquals("    *    \n   ***   \n  *****  \n ******* \n*********\n", triangle.drawIsoscelesTriangle(5));
    }

    @Test
    public void drawDiamondTriangle() throws Exception {
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", triangle.drawDiamondTriangle(3));
    }

}