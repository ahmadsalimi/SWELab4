public class Square implements Areaable {
    private double width;

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    public Square(double width) {
        this.width = width;
    }

    @Override
    public double computeArea() {
        return width * width;
    }
}
