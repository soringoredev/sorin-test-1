import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        //8.	Creati un program care primeste la intrare ora si
        // returneaza ca raspuns ce parte a zilei este
        // (ATENTIE! 24h trebuiesc impartite in minimum 4 parti)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti ora: ");
        int ora = scanner.nextInt();

        if (ora < 7) {
            System.out.println("Dimineata devreme");
        } else if (ora < 12) {
            System.out.println("Dimineata");
        } else if (ora < 17) {
            System.out.println("Ziua");
        } else {
            System.out.println("Seara");
        }

    }
}
