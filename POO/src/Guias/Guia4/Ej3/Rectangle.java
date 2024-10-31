package Guias.Guia4.Ej3;

public class Rectangle extends Figure {

    private final Point topLeft, bottomRight;

    public Rectangle(Point topLeft, Point bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double base(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    public double height(){
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    public double perimeter(){
        return 2 * (height() + base());
    }

    public double area(){
        return height() * base();
    }

    @Override
    public String toString() {
        return "Rectángulo [ %s , %s ]".formatted(topLeft, bottomRight);
    }

}
