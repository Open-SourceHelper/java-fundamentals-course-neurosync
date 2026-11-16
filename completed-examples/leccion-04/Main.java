import java.util.Scanner;

public class Main {
    public static void greet() {
        System.out.println("Hola, vamos a conocer a tu mascota");
    }

    public static void greetPet(String name) {
        System.out.println("Bienvenida, " + name);
    }

    public static void main(String[] args) {
        greet();
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu mascota:");
        String name = input.nextLine();
        Pet pet = new Pet();
        pet.name = name;
        greetPet(pet.name);
        input.close();
    }
}

class Pet {
    String name;
}
