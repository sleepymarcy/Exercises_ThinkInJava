package s.oop_elements.ecosystem_maybe;

// TODO: maybe later

public class Animal {
    long id; // unique id
    boolean isAlive;
    long age; // in seconds
    long mass; // in grams

    int healthPoints;
    int maxHealth;

    int hungerPoints;
    int maxHunger;

    int thirstPoints;
    int maxThirst;

    int energyPoints;
    int maxEnergy;

    public boolean die() {
        isAlive = false;
        return isAlive;
    }

    // TODO: Change the argument to Food object
    // TODO: Create Food class for this purpose
    // It would make sense to increase animal's mass if they consume food
    // after that some digestion and excretion process would take place
    public boolean eat(int hungerPoints) {
        this.hungerPoints += hungerPoints;
        if(this.hungerPoints > maxHunger){
            this.hungerPoints = maxHunger;
        }

        // we can make the animal nourish itself to death :P
        return isAlive;
    }

    // I actualy think animal should gain thirst points from Food
    // so that this method would be unnecessary
    // TODO: Remove this method later
    public boolean drink(int thirstPoints) {
        this.thirstPoints += thirstPoints;
        if (this.thirstPoints > maxThirst) {
            this.thirstPoints = maxThirst;
        }
        return isAlive;
    }

    public boolean age(long seconds) {
        age += seconds;

        // TODO: age process
        // if aging - consume thirst points and hungerpoints etc

        // TODO: if something then die.
        return isAlive;
    }
}

// Animal Classes
// The phylum group is then divided into even smaller groups, known as animal classes. The Chordata phylum splits into these seven animal classes:

// Agnatha (jaw-less fish) –  Primitive jawless fish including lampreys, hagfishes, and extinct groups.
// Chrondrichtyes (cartilaginous fish) – Composed of fish with skeletons composed of cartilage. Includes two subclasses: Elasmobranchii (rays, skates, sawfish, and sharks); Holocephali (chimaeras–ghost sharks).
// Osteichthyes (bony fish) – Includes saltwater and freshwater fish with bony skeletons like eels, anglerfish, clown fish, swordfish, and catfish, carp, trout, and salmonids.
// Amphibia (amphibians) –  Four-limbed, ectothermic vertebrates, including frogs, toads, salamanders, and newts.
// Reptilia (reptiles) – Vertebrates with dry skin and scales such as snakes, turtles, lizards, and crocodilians.
// Aves (birds) – Warm-blooded, egg-laying animals characterized by two wings, two legs, and feathers.
// Mammalia (mammals) – Warm-blooded four-legged (or two-armed, two-legged) animals that breathe with lungs and birth live young.
