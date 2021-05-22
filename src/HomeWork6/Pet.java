package HomeWork6;

import java.net.SocketOption;

public abstract class Pet {
    protected String name;
    public Pet(String name) {
        this.name = name;
    }

    public abstract void run(int a);

    public abstract void swim(int b);

}
// По поводу абстрактного класса понимаю, что не самое лучшее решение, но пока додумалась только до этого.