public class FoodBow1 {
    private int foodAmount;
    public FoodBow1(int initialFoodAmount) {
        this.foodAmount = initialFoodAmount;
    }
    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println(" В миску добавлено " + amount + " еды. Теперь в миске: " + foodAmount);
    }
    public void feed(Animals animal, int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            animal.eat(amount);
            System.out.println(animal.getName() + " поел из миски. Осталось еды: " + foodAmount);
        }else {
            System.out.println("В миске недостаточно еды для " + animal.getName() + "!");
        }
    }
    public int getFoodAmount() {
        return foodAmount;
    }
}
