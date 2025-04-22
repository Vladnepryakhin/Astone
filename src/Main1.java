public class Main1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5,new Color("Red", "Black"));
        Rectangle rectangle = new Rectangle(4, 6, new Color("Yellow", "Green"));
        Trinagle trinagle = new Trinagle(5, 6, 7, new Color("Blue", "Purple"));
        circle.printCharectiristics();
        rectangle.printCharecterictics();
        trinagle.printCharacteristics();
    }
}