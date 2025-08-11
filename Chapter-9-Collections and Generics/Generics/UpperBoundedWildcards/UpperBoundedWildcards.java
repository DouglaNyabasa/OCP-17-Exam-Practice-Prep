import java.util.ArrayList;
import java.util.List;


// use this command if you are failing to find the main class for the animal class 
//java -cp . UpperBoundedWildcards

class Animal {
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class UpperBoundedWildcards {
    public static void makeSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        List<Cat> catList = new ArrayList<>();
        dogList.add(new Dog());
        catList.add(new Cat());
        makeSound(dogList);
        makeSound(catList);
    }}

