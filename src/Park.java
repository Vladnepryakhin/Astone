public class Park {
    private Attraction[] attractions;
    private int count;

    public Park(int capacity) {
        this.attractions = new Attraction[capacity];
        this.count = 0;
    }

    public void addAttraction(String name, String workTime, double price) {
        if (this.count < this.attractions.length) {
            this.attractions[this.count] = new Attraction(name, workTime, price);
            ++this.count;
        } else {
            System.out.println("Достигнуто максимальное количество аттракционов!");
        }

    }

    public void printAttractions() {
        for(int i = 0; i < this.count; ++i) {
            System.out.println(this.attractions[i]);
        }

    }

    public static void main(String[] args) {
        Park park = new Park(5);
        park.addAttraction("Колесо обозрения", "10:00 - 22:00", (double)300.0F);
        park.addAttraction("Американские горки", "11:00 - 20:00", (double)500.0F);
        park.addAttraction("Карусель", "09:00 - 18:00", (double)200.0F);
        park.printAttractions();
    }

    public class Attraction {
        private String name;
        private String workTime;
        private double price;

        public Attraction(String name, String workTime, double price) {
            this.name = name;
            this.workTime = workTime;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkTime() {
            return this.workTime;
        }

        public void setWorkTime(String workTime) {
            this.workTime = workTime;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String toString() {
            return "Аттракцион: " + this.name + ", Время работы: " + this.workTime + ", Стоимость: " + this.price + " руб.";
        }
    }
}
