package Polyporphism;

public class Animalsdz {
    public static void main(String[] args) {
        Animals[] animals = {
                new Lion("Лев"),
                new Parrot("Попугай"),
                new Fish("Рыба")
        };

        for (Animals animal : animals) {
                animal.info();
                animal.makeSound();
                animal.move();
                animal.eat();
           System.out.println("--------------------------");
        }
    }
}


class Animals {
    String name;

    void makeSound(){
        System.out.println("Звук животного");
    }

    void move() {
        System.out.println("Животное двигается");
    }

    void eat() {
        System.out.println("Животное ест");
    }

    void info() {
        System.out.println("Имя животного: " + name);
    }
}

class Lion extends Animals {
    public Lion(String name) {
        super();
    }

    @Override
    void makeSound() {
        System.out.println("Рычит");
    }

    @Override
    void move() {
        System.out.println("Бегает-ходит");
    }

    @Override
    void eat() {
        System.out.println("Ест мясо");
    }
}

class Parrot extends Animals {
    public Parrot(String name) {
        super();
    }

    @Override
    void makeSound() {
        System.out.println("Разговаривает");
    }

    @Override
    void move() {
        System.out.println("Летает");
    }

    @Override
    void eat() {
        System.out.println("Ест семена");
    }
}

class Fish extends Animals {
    public Fish(String name) {
        super();
    }

    @Override
    void makeSound() {
        System.out.println("Булькает");
    }

    @Override
    void move() {
        System.out.println("Плавает");
    }

    @Override
    void eat() {
        System.out.println("Ест водоросли");
    }
}