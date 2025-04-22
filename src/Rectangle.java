class Rectangle implements Figyri {
    private double widht;
    private double height;
    private Color color;
    public Rectangle(double widht, double height, Color color) {
        this.widht = widht;
        this.height = height;
        this.color = color;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * widht * height;
    }

    @Override
    public double calculateArea() {
        return widht * height;
    }
    public void printCharecterictics(){
        System.out.println("Rectangle :");
        System.out.println("Width: " + widht);
        System.out.println(" Height: " + height);
        System.out.println(" Perimetr: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println(" Fill color: " + color.getFillColor());
        System.out.println("Border color: " + color.getBorderColor());
    }
}
