public class Main {
    public static void main(String[] args) {
        Dog dogSharick = new Dog(" Шарик ");
        Cat catMurzik = new Cat(" Мурзик ");
        FoodBow1 foodBow1 = new FoodBow1(60);
        dogSharick.run(150);
        dogSharick.run(600);
        dogSharick.swim(100);
        dogSharick.swim(200);
        catMurzik.run(150);
        catMurzik.run(600);
        catMurzik.swim(100);
        foodBow1.feed(dogSharick, 50);
        foodBow1.feed(catMurzik, 20);
        foodBow1.addFood(50);
        foodBow1.feed(catMurzik, 20);
        System.out.println("Всего животных: " + Animals.getTotalAnimals());
        System.out.println(" Всего псов: " + Animals.getTotalDogs());
        System.out.println( " Всего кисонек: " + Animals.getTotalCats());

    }
}
