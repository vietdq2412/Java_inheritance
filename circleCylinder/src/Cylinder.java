public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }


    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHeight: " + height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }
}
