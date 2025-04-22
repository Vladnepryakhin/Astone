class Circle implements Figyri {
    private double radius;
    private Color color;
    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public void printCharectiristics(){
        System.out.println("Circle:");
        System.out.println("radius: " + radius);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color " + color.getFillColor());
        System.out.println("Border color " + color.getBorderColor());
    }
}
