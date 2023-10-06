import java.util.Scanner;

public class HeadFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine(); // Consuma a quebra de linha pendente
        String name = scanner.nextLine();
        x *= 17;

        if (x == 10) {
            System.out.println("x é 10");
        } else {
            System.out.println("x não é 10");
        }

        if (x < 3 || "Vinicius".equals(name)) {
            System.out.println("Vinicius");
        }
    }
}
