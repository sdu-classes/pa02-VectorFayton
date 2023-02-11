public class Square extends Rectangle
{
    public Square()
    {

    }

    public Square(double side)
    {
        super(side, side)
    }

    public Square(double side, String color, boolean filled)
    {
        super(color, filled);
        super(side, side);
    }

    public double getSide()
    {
        return super.getLength();
    }

    public setWidth(double side)
    {
        super(side, side);
    }

    public setLength(double side)
    {
        super();
    }
}