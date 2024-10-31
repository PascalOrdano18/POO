package Guias.Guia3.Ej9;

public class Point {

    private final double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{%.2f, %.2f}".formatted(x, y);
    }

    public double distanceTo(Point other){
        return Math.sqrt(Math.pow(other.x - x, 2) + Math.pow(other.y - y, 2));
    }

}
