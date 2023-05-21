public class Inheritenceex {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
    }

}

//Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammals {
    String breed;
}

// Derived Class
class Fish extends Animal {

    void swim() {
        System.out.println("swims in water");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}
