package Lecture5;

public class Hero {
    private int health; // поле класса, должно быть приватное
    private    int speed;
    private   String name;
    private   Sword sword;

    public static String voice = "Hello I'm Hero";

 //   Hero () {
 //       speak();
 //   }

    Hero(int valueHealth, int valueSpeed, String valueName) {
       health = valueHealth;
       speed = valueSpeed;
       name = valueName;
       sword = new Sword();

    }
 //   Hero(int valueHealth, int valueSpeed){
 //       health = valueHealth;
 //       speed = valueSpeed;
 //   }


    void move() {
        System.out.println(name + " has move with speed " + speed);
    }
    void speak() {
        System.out.println(name + " says Hello!");
    }
    void damage(){
        health -= 10;
        System.out.println(name + " has damage 10pnt. My health now is " + health);
    }
   private class Sword {
    int weight;
    float atkSpeed;
    int attack;
    void dealDamage() {
       System.out.println("Our sword deal damage" + attack);
    }
    }

    // Getter открывает досту для чтения приватного поля
    public String getName(){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getSpeed(){
        return speed;
    }
    // Setter открывает доступ для записи приватного поля
    public void setName(String name){
       this.name = name;
    }
}
