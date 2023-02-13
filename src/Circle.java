public class Circle {
    private static final double PI = Math.PI;

    public static double area(double radius) {
        double area = PI * (radius * radius);
        System.out.println(" The area is " + area);
        return area;
    }

    public static double circumference(double radius) {
        double circumference = PI * 2 * radius;
        System.out.println(" The circumference " + circumference);
        return circumference;
    }
}
