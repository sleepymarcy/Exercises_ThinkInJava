package s.oop_elements.animals_and_sounds;

public class Animal {
    private String name;
    private int age;
    private boolean isAlive;
    private int crimesAmout;
    private String sound;

    private Animal() {}

    protected Animal(String name, boolean isAlive, String sound) {
        this.name = name;
        this.isAlive = isAlive;
        this.sound = sound;
    }

    
    public String getName() {
        return name;
    }

    public void makeSound() {
        if(isAlive)
            System.out.println(sound);
        else
            System.out.println("x.x");
    }

    // A rap sheet is an official record of arrests and prosecutions (RAP). It has
    // information that includes charges, convictions, and dismissals. The state of
    // California and the federal government maintain rap sheets on people involved
    // with the law. It is the official record of your criminal history.
    public void rapSheet() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is alive: " + isAlive);
        System.out.println("Crimes amount: " + crimesAmout);
    }

    public void commitCrime() {
        crimesAmout++;
    }

    public void commitCrimes(int crimesAmout) {
        this.crimesAmout += crimesAmout;
    }

    public void age() {
        this.age++;
    }
    
    public boolean die() {
        return isAlive = false;
    }

}