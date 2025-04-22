class Trinagle implements Figyri {
    private double sideA;
    private double sideB;
    private double sideC;
    private Color color;
    public Trinagle(double sideA, double sideB, double sideC, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }
    @Override
    public double calculatePerimeter() {
        return sideA * sideB * sideC;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
    public void printCharacteristics(){
        System.out.println("Trinagle: ");
        System.out.println("SideA: " + sideA);
        System.out.println("SideB: " + sideB);
        System.out.println("SideC: " + sideC);
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Area: " + calculateArea());
        System.out.println("Fill color: " + color.getFillColor());
        System.out.println("Border color: " + color.getBorderColor());
    }
}
