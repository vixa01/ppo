public class Circle {
private Point center;
private double radius;

public Circle(Point center, double radius) {
this.center = center;
this.radius = radius;
}

public Point getCenter() {
return center;
}

public double getRadius() {
return radius;
}

public boolean contains(Point p) {
double distance = Math.sqrt(Math.pow(p.getX() - center.getX(), 2) + Math.pow(p.getY() - center.getY(), 2));
return distance <= radius;
}
}