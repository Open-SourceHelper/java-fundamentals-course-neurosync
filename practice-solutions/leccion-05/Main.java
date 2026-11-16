public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Nube");
        for (int i = 0; i < 4; i++) {
            pet.play();
        }
        System.out.println("Energia: " + pet.getEnergy());
        pet.rest();
        System.out.println("Despues de descansar: " + pet.getEnergy());
        pet.setName("");
        System.out.println("Nombre: " + pet.getName());
        pet.setName("Sol");
        System.out.println("Nombre nuevo: " + pet.getName());
        System.out.println("Letras: " + pet.getName().length());
    }
}
class Pet {
    private String name;
    private int energy;

    public Pet(String name) {
        this.name = name;
        this.energy = 3;
    }

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public void play() {
        if (energy > 0) {
            energy--;
            System.out.println(name + " juega");
        } else {
            System.out.println(name + " necesita descansar");
        }
    }

    public void rest() {
        if (energy < 5) {
            energy++;
        }
    }
}
