import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================== Exercício FizzBuzz ======================");

        Scanner scanner = new Scanner(System.in);
        int multiplosDe3E5 = 0;
        int multiplosDe5 = 0;
        int multiplosDe3 = 0;

        System.out.println("Substitui números múltiplos de 3 por \"Fizz\"\n" +
                "Substitui números múltiplos de 5 por \"Buzz\"\n" +
                "Para números múltiplos de ambos, 3 e 5, imprima \"FizzBuzz\"\n");

        System.out.print("Digite o até qual número nosso contador vai: ");
        int MAX = scanner.nextInt();
        System.out.println("\n================================================================");

        for (int i = 1; i <= MAX; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz, ");
                multiplosDe3E5 ++;
                multiplosDe3 ++;
                multiplosDe5 ++;
            } else if (i % 3 == 0) {
                System.out.print("Fizz, ");
                multiplosDe3 ++;
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
                multiplosDe5 ++;
            } else {
                System.out.print(i + ", ");
            }
        }

        System.out.print("Acabou o contador...");
        System.out.println("\n\nMultiplos de 3: " + multiplosDe3 +
                "\nMultiplos de 5: " + multiplosDe5 +
                "\nMultiplos de 3 e 5: " + multiplosDe3E5);

        scanner.close();
    }
}