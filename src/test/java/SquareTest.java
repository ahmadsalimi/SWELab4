import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void computeArea() {
        Square square = new Square(5);
        double area = square.computeArea();
        Assert.assertEquals(25, area, 1e-6);
    }

    @Test
    public void modifyWidth() {
        Square square = new Square(5);
        square.setWidth(7);
        Assert.assertEquals(7, square.getWidth(), 1e-6);
    }
}
