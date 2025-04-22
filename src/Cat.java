class Cat extends Animals {
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
        incrementCat();
    }

    private void incrementCat() {
    }

    @Override
    public void run(int distance) {
        if (isHungry()) {
            System.out.println(getName() + " слишком голоден, чтобы бежать!");
            return;
        }

        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(getName() + " пробежал " + distance + "м");
        } else {
            System.out.println(getName() + " не может пробежать " + distance + "м, максимум " + MAX_RUN_DISTANCE + "м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать");
    }
}