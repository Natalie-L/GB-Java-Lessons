package HomeWork6;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void swim(int b) {
        System.out.println(name + " не умеет плавать");
    }
    @Override
    public void run(int a) {
        if (a <= 200 && a > 0) {
            System.out.println(name + " пробежал " + a + " м.");
        }
        else {
            System.out.println(name + " не может пробежать такое растояние");
        }
    }
}
