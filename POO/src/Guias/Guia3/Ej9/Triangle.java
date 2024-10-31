package Guias.Guia3.Ej9;

public class Triangle extends Figure{

    private final Point p1, p2, p3;

    public Triangle(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double area(){
        double semiPerimiter = perimeter() / 2;
        return Math.sqrt(semiPerimiter * (semiPerimiter - firstSide())
                * (semiPerimiter - secondSide()) * (semiPerimiter - thirdSide()));
    }

    @Override
    public double perimeter() {
        return firstSide() + secondSide() + thirdSide();
    }

    private double firstSide() {
        return p1.distanceTo(p2);
    }

    private double secondSide() {
        return p2.distanceTo(p3);
    }

    private double thirdSide() {
        return p3.distanceTo(p1);
    }

    @Override
    public String toString() {
        return "Triángulo [ %s , %s , %s ]".formatted(p1, p2, p3);
    }
}
