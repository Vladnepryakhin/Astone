public class Tovar {
    String name;
    int date;
    String manufacturer;
    String country;
    int price;
    String condition;

    public Tovar(String name, int date, String manufacturer, String country, int price, String condition) {
        this.name = name;
        this.date = date;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.condition = condition;
        System.out.println("Этот конструктор по умолчанию");
        System.out.println("Название" + name + "Дата изготовления" + date + "Производитель" + manufacturer + "Страна" + country + "Цена" + price + "Статус" + condition);
    }
}
