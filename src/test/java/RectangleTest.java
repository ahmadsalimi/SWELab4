import org.junit.Test;
import org.junit.Assert;

public class RectangleTest {

    @Test
    public void computeArea() {
        Rectangle rectangle = new Rectangle(3, 4);
        double area = rectangle.computeArea();
        Assert.assertEquals(12, area, 1e-6);
    }

    @Test
    public void modifyHeight() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setHeight(5);
        Assert.assertEquals(5, rectangle.getHeight(), 1e-6);
    }

    @Test
    public void modifyWidth() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setWidth(7);
        Assert.assertEquals(7, rectangle.getWidth(), 1e-6);
    }
}
