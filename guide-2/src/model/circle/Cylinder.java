package model.circle;

public class Cylinder extends Circle {
    private Float altitude;

    public Cylinder() {
        super();
        this.altitude = 1.0F;
    }

    public Cylinder(Float radius, String color, Float altitude) {
        super(radius, color);
        this.altitude = altitude;
    }

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public Float calculateVolume() {
        return (float) calculateArea() * getAltitude();
    }

    @Override
    public Float calculateArea() {
        return (float) (2 * Math.PI * getRadius() * getAltitude() + 2 * Math.PI * Math.pow(getRadius(), 2));
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "color=" + color +
                ", radius=" + radius +
                ", altitude=" + altitude +
                ", area=" + calculateArea() +
                ", volume='" + calculateVolume() + '\'' +
                '}';
    }
}
