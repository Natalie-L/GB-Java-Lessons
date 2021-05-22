package HomeWork6;

public class Dog extends Pet{
    public Dog (String name) {
        super(name);

    }
    @Override
    public void run(int a) {
        if (a <= 500 && a > 0) {
            System.out.println(name + " пробежал " + a + " м.");
        }
        else {
            System.out.println(name + " не может пробежать такое растояние");
        }
    }
    public void swim(int b) {
            if (b <= 10 && b > 0) {
                System.out.println(name + " проплыл " + b + " м.");
            }
            else {
                System.out.println(name + " не может проплыть такое растояние");
            }
        }

    }

