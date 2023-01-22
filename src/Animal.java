public class Animal {
    String animalName;

    public Animal(String name) {
        this.animalName = name;
    }

    void animalSound() {
        System.out.println("Roar!");
    }

    void animalSound(String Intensity) {
        if (Intensity == "High") {
            System.out.println("Roarrrrr!");
        } else if (Intensity == "Low") {
            System.out.println("Roar");
        } else {
            System.out.println("Cannot reproduce ir properly");
        }
    }
}
