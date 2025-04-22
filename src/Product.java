public class Product {
    private String name;
    private String releaseDate;
    private String manufacturer;
    private String country;
    private double price;
    private String available;

    public Product(String name, String releaseDate, String manufacturer, String country, double price, String available) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.available = available;
    }

    public String toString() {
        return "Product{ name " + this.name + " releaseDate " + this.releaseDate + " manufacturer " + this.manufacturer + " country " + this.country + " price " + this.price + " available" + this.available + "}";
    }
}
