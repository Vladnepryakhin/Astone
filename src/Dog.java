public class Dog extends Animals {
    private static final int MAX_RUN_DISTANTE = 500;
    private static final int MAX_SWIM_DISTANTE = 100;
    public Dog(String name) {
        super(name);
        incrementTotalDogs();
    }
    @Override
    public void run( int distance) {
        if (isHungry()) {
            System.out.println(getName() + " Дай пожрать кожанный, не побегу.");
            return;
        }
        if (distance <= MAX_RUN_DISTANTE) {
            System.out.println(getName() + " Пробежал " + distance + " м ");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + " м, максимум " + MAX_RUN_DISTANTE + " м ");
        }
    }
    @Override
    public void swim(int distance) {
        if (isHungry()) {
            System.out.println(getName() + " Сам плыви чудик на голодный желудок. ");
            return;
        }
        if (distance <= MAX_SWIM_DISTANTE) {
            System.out.println(getName() + " проплыл " + distance + " м ");
        }else {
            System.out.println(getName() + " не может проплыть " + distance + " м, максимум " + MAX_SWIM_DISTANTE + " м ");
        }
    }
}