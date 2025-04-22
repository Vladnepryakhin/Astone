abstract class Animals {
    private String name;
    private int satiety;
    private static int totalAnimals = 0;
    private static int totalDogs = 0;
    private static int totalCats = 0;

    public Animals(String name) {
        this.name = name;
        this.satiety = 0;
        totalAnimals++;
    }
    public abstract void run( int distance);
    public abstract void swim( int distance);
    public String getName(){
        return name;
    }
    public void eat(int foodAmount){
        satiety += foodAmount;
        if (satiety > 102){
            satiety = 100;
        }
        System.out.println(name + " поел. Уровень сытости: " + satiety);
    }
    protected boolean isHungry(){
        return (satiety <= 0);
    }
    protected void decreaseSatiety(int amount){
        satiety -= amount;
        if (satiety < 0){
            satiety = 0;
        }
    }
    public static int getTotalAnimals() {
        return totalAnimals;
    }
    public static int getTotalDogs() {
        return totalDogs;
    }
    public static int getTotalCats() {
        return totalCats;
    }
    protected static void incrementTotalCats (){
        totalCats++;
    }
    protected static void incrementTotalDogs() {
        totalDogs++;
    }
}