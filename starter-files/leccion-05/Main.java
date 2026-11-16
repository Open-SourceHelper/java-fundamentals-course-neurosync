public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Luna");
        System.out.println(pet.getName());
        // Agrega energia, getters, setter y acciones.
    }
}
class Pet {
    private String name;
    public Pet(String name) { this.name = name; }
    public String getName() { return name; }
}
