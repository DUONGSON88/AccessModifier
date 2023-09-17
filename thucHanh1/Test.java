package thucHanh1;

import thucHanh1.animal.Animal;
import thucHanh1.animal.Chicken;
import thucHanh1.animal.Tiger;
import thucHanh1.edible.Edible;
import thucHanh1.fruit.Apple;
import thucHanh1.fruit.Fruit;
import thucHanh1.fruit.Orange;


public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

