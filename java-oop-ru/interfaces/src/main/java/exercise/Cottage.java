package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public double getArea() {
        return area;
    }
    public int compareTo(Home anotherHome) {
        if (this.getArea() < anotherHome.getArea()) {return -1;}
        else if (this.getArea() > anotherHome.getArea()) {return 1;}
        else return 0;
    }
    @Override
    public String toString() {
        return  floorCount
                + " этажный коттедж площадью "
                + this.getArea()
                + " метров";
    }
}
// END
