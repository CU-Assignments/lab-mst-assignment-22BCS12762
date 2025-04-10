class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(super.name + " barks.");
    }

    public void displayDogInfo() {
        super.displayInfo();
        System.out.println("Dog Breed: " + breed);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.displayDogInfo();
        myDog.makeSound();
    }
}
