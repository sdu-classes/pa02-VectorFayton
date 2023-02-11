import java.awt.*;
import java.awt.font.TextHitInfo;


public class Circle extends Shape
{
    private double radius;

    public Circle()
    {
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.pow(radius, 2) * Math.PI;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle["import java.awt.*;
import java.awt.font.TextHitInfo;


        public class Circle extends Shape
        {
            private double radius;

            public Circle()
            {
            }

            public Circle(double radius)
            {
                this.radius = radius;
            }

            public Circle(double radius, String color, boolean filled)
            {
                super(color, filled);
                this.radius = radius;
            }

            public double getRadius() {
                return radius;
            }

            public void setRadius(double radius) {
                this.radius = radius;
            }

            public double getArea()
            {
                return Math.pow(radius, 2) * Math.PI;
            }

            public double getPerimeter()
            {
                return 2 * Math.PI * radius;
            }

            @Override
            public String toString() {
                return "Circle[" + super.toString() + ",[" + radius + "]";
            }
        }
        + super.toString() + ",[" + radius + "]";
    }
}
