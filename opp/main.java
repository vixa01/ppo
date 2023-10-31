public class Main {
public static void main(String[] args) {
Point p1 = new Point(0, 0);
Point p2 = new Point(0, 1);
Point p3 = new Point(1, 1);
Point p4 = new Point(1, 0);
Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
System.out.println("Rectangle area: " + Calculator.calculateRectangleArea(rectangle));

Point center = new Point(1, 1);
double radius = 1;
Circle circle = new Circle(center, radius);
Point point1 = new Point(0.5, 0.5);
Point point2 = new Point(1, 1);
System.out.println("Point 1 in circle: " + Calculator.isPointInCircle(circle, point1));
System.out.println("Point 2 in circle: " + Calculator.isPointInCircle(circle, point2));
}
}