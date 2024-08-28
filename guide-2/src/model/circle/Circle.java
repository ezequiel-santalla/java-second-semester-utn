package model.circle;

public abstract class Circle {
    protected Float radius;
    protected String color;

    public Circle() {
        this.radius = 1.0F;
        this.color = "red";
    }

    public Circle(Float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Float getRadius() {
        return radius;
    }

    public void setRadius(Float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float calculateArea() {
        return (float) (Math.PI * Math.sqrt(getRadius()));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
