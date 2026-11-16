public class Main {
    public static void main(String[] args) {
        int age = 12;
        if (age > 12) {
            System.out.println("Puedes entrar al reto avanzado");
        } else {
            System.out.println("Empieza por el reto inicial");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Salto " + (i + 1));
        }
        int countdown = 2;
        while (countdown > 0) {
            System.out.println("Cuenta: " + countdown);
            countdown--;
        }
        System.out.println("Fin");
    }
}
