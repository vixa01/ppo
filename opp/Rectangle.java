public class Rectangle {
private Point p1;
private Point p2;
private Point p3;
private Point p4;

public Rectangle(Point p1, Point p2, Point p3, Point p4) {
this.p1 = p1;
this.p2 = p2;
this.p3 = p3;
this.p4 = p4;
}

public double getArea() {
double length = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
double width = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
return length * width;
}

public Point getP1() {
return p1;
}

public Point getP2() {
return p2;
}

public Point getP3() {
return p3;
}

public Point getP4() {
return p4;
}
}