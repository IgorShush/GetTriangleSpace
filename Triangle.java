public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Triangle(Point A, Point B, Point C)
    {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getSpace()
    {
        return (Math.abs(0.5 * ( (B.getX() - A.getX()) * (C.getY() - A.getY()) - (C.getX() - A.getX()) * (B.getY() - A.getY()))));
    }
}
