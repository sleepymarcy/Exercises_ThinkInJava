// import tij.exercises.*;
import java.util.ArrayList;

import s.oop_elements.animals_and_sounds.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> fuckingCriminals = new ArrayList<Animal>();

        fuckingCriminals.add(new Dog("Burek"));
        fuckingCriminals.add(new Cat("Filon"));
        fuckingCriminals.add(new Cat("Rudy Rydz"));
        fuckingCriminals.add(new Cow("Strokrotka"));

        // doCrimes(12, fuckingCriminals);
        try {
            findCriminal("Burek", fuckingCriminals).die();
        } catch (NullPointerException e) {
            System.out.println("No such criminal!");
        }

        // for (Animal animal : fuckingCriminals) {
        // animal.rapSheet();
        // System.out.println();
        // }
        for (Animal animal : fuckingCriminals) {
            animal.makeSound();
        }

    }

    public static void doCrimes(int amount, ArrayList<Animal> listOfCriminals) {
        for (Animal criminal : listOfCriminals) {
            criminal.commitCrimes(amount);
        }
    }

    public static Animal findCriminal(String name, ArrayList<Animal> listOfCriminals) {
        for (Animal criminal : listOfCriminals) {
            if (name.equals(criminal.getName())) {
                return criminal;
            }
        }
        return null;
    }
}
